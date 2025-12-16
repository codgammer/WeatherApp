function getWeather() {
    const city = document.getElementById("city").value;
    const result = document.getElementById("result");

    if (!city) {
        result.innerHTML = "<p>⚠️ Enter a city name</p>";
        return;
    }

    result.innerHTML = "<p>⏳ Fetching weather...</p>";

    fetch("http://localhost:8080/api/weather/" + city)
        .then(res => {
            if (!res.ok) throw new Error("City not found");
            return res.json();
        })
        .then(data => {
            result.innerHTML = `
                <h3>${data.location.name}, ${data.location.country}</h3>
                <p>🌡 ${data.current.temp_c} °C</p>
                <p>💧 Humidity: ${data.current.humidity}%</p>
                <p>💨 Wind: ${data.current.wind_kph} km/h</p>
                <p>🌤 ${data.current.condition.text}</p>
                <img src="https:${data.current.condition.icon}" />
            `;
        })
        .catch(() => {
            result.innerHTML = "<p>❌ Unable to fetch weather</p>";
        });
}
