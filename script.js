const textToBinary = () => {
  const input = document.getElementById("txt-1");
  const output = document.getElementById("txt-2");

  let binaryText = "";

  input.value.split("").forEach(c => {
    if (!isNaN(c) && c != " ") {
      binaryText += `${Number(c).toString(2).padStart(8, "0")} `;
    } else {
      binaryText += `${c.charCodeAt().toString(2).padStart(8, "0")} `;
    }
  });

  output.innerText = binaryText;
}
