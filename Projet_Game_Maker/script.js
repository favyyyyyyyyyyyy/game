document.addEventListener("DOMContentLoaded", function () {
    // Données de test
    var cropYields = [];
    for (var i = 0; i < 12; i++) {
        cropYields.push(Math.floor(Math.random() * (100 - 50 + 1)) + 50);
    }

    // Création du tableau
    var table = document.getElementById("cropTable");

    // En-tête du tableau
    var thead = table.createTHead();
    var headerRow = thead.insertRow();
    for (var i = 0; i < 12; i++) {
        var th = document.createElement("th");
        th.textContent = "Mois " + (i + 1);
        headerRow.appendChild(th);
    }

    // Corps du tableau
    var tbody = table.createTBody();
    var dataRow = tbody.insertRow();
    for (var i = 0; i < 12; i++) {
        var td = dataRow.insertCell();
        td.textContent = cropYields[i];
    }
});
