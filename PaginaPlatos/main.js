
import { env } from "config.js";
const url = `${env.ssl + env.hostName}:${env.port}`;

const dialog = document.querySelector("dialog");
let myTodo = document.querySelector("#myTodo");
let myData = document.querySelector("#myData");

addEventListener("DOMContentLoaded", async (e) => {
  let rel = await (await fetch("http://localhost:8080/api/platos", config)).json();

  rel = rel.map((res) => {
      return `
            <tr>
                <td>${res.nombre}</td>
                <td>${res.descripcion}</td>
                <td>${res.precio}</td>
                <td>${res.fechaElaboracion}</td>
            </tr>
        `;
  });
  myData.insertAdjacentHTML("beforeend", `${rel.join("")}`);
  const mostrar = document.createElement(div);
  
  console.log(mostrar)

});
