const textToBinary = () => {
  const input = document.getElementById("txt-1");
  const output = document.getElementById("txt-2");
  const ch = input.value.split("");

  let binaryTxt = "";
  ch.forEach(e => {
    binaryTxt += `${e.charCodeAt().toString(2).padStart(8, "0")} `;
  });

  output.innerText = binaryTxt;
}