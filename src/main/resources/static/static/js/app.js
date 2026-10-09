const API = "http://localhost:8080/equipamentos";

async function carregar() {
    const response = await fetch(API);
    const dados = await response.json();

    const lista = document.getElementById("lista");
    lista.innerHTML = "";

    dados.forEach(e => {
        lista.innerHTML += `
            <li>
                ${e.nome} - ${e.consumoPadrao}
            </li>
        `;
    });
}

document.getElementById("formEquipamento")
.addEventListener("submit", async (e) => {

    e.preventDefault();

    const nome = document.getElementById("nome").value;
    const consumo = document.getElementById("consumo").value;

    await fetch(API, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            nome,
            consumoPadrao: consumo
        })
    });

    carregar();
});

carregar();

/*
const API = 'http://localhost:8080/equipamentos';

async function listarEquipamentos() {

    const resposta = await fetch(API);

    const equipamentos = await resposta.json();

    const tabela = document.getElementById('tabelaEquipamentos');

    tabela.innerHTML = '';

    equipamentos.forEach(equipamento => {

        tabela.innerHTML += `
            <tr>
                <td>${equipamento.id}</td>
                <td>${equipamento.nome}</td>
                <td>${equipamento.potencia}</td>
                <td>
                    <button class="btn btn-danger btn-sm"
                        onclick="deletarEquipamento(${equipamento.id})">
                        Excluir
                    </button>
                </td>
            </tr>
        `;
    });
}

async function salvarEquipamento() {

    const nome = document.getElementById('nome').value;
    const potencia = document.getElementById('potencia').value;

    await fetch(API, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            nome,
            potencia
        })
    });

    listarEquipamentos();
}

async function deletarEquipamento(id) {

    await fetch(`${API}/${id}`, {
        method: 'DELETE'
    });

    listarEquipamentos();
}

listarEquipamentos();*/
