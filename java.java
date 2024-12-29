let display = document.getElementById('display');

// Função para adicionar números e operadores à tela
function appendToDisplay(value) {
  display.value += value;
}

// Função para limpar a tela
function clearDisplay() {
  display.value = '';
}

// Função para calcular o resultado
function calculate() {
  try {
    display.value = eval(display.value);
  } catch (e) {
    display.value = 'Erro';
  }
}
