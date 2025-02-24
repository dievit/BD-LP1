<h1 align="center"> Bem-vindo(a) ao repositório de Linguagem de Programação I </h1>
<h3 align="center">
Os exercícios estão listados abaixo juntamente com seus respectivos testes de mesa.
</h3>
<details>
  <summary>💻 Exercício 1</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise1.java>Código exercício 1</a>


  ## 📝 **Teste de Mesa 1 - Entrada Válida**
📌 **Entrada:**

```

Digite a sua idade em anos: 25
Digite a sua idade em meses: 6
Digite a sua idade em dias: 15

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 25 | Usuário digita a idade em anos | `anos` | 25 |
| 6 | Usuário digita a idade em meses | `meses` | 6 |
| 15 | Usuário digita a idade em dias | `dias` | 15 |
| - | Calcula idade total em dias | `idadeParaDias = (25 * 365) + (6 * 30) + 15` | **9.165** |
| - | Exibe saída | `"Sua idade em dias é: 9165"` |  |

---

## 📝 **Teste de Mesa 2 - Entrada Inválida para Meses**

📌 **Entrada:**

```

Digite a sua idade em anos: 30
Digite a sua idade em meses: 15
O ano só tem 12 meses seu burro! Digite novamente: 10
Digite a sua idade em dias: 20

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 30 | Usuário digita a idade em anos | `anos` | 30 |
| 15 | Usuário digita a idade em meses | `meses` | 15 (inválido) |
| 10 | Usuário corrige a idade em meses | `meses` | 10 |
| 20 | Usuário digita a idade em dias | `dias` | 20 |
| - | Calcula idade total em dias | `idadeParaDias = (30 * 365) + (10 * 30) + 20` | **11.150** |
| - | Exibe saída | `"Sua idade em dias é: 11150"` |  |

</details>

<details>
  <summary>💻 Exercício 2</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise2.java>Código exercício 2</a>

  ## 📝 **Teste de Mesa 1 - Entrada Normal**

📌 **Entrada:**

```

Digite o total de votos em branco: 100
Digite o total de votos nulos: 200
Digite o total de votos válidos: 700

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 100 | Usuário digita votos brancos | `brancos` | 100 |
| 200 | Usuário digita votos nulos | `nulos` | 200 |
| 700 | Usuário digita votos válidos | `validos` | 700 |
| - | Calcula total de eleitores | `totalEleitores = 100 + 200 + 700` | **1000** |
| - | Calcula percentual de votos em branco | `(100 * 100) / 1000` | **10.00%** |
| - | Calcula percentual de votos nulos | `(200 * 100) / 1000` | **20.00%** |
| - | Calcula percentual de votos válidos | `(700 * 100) / 1000` | **70.00%** |
| - | Exibe saída | `"Total de eleitores: 1000.00"` |  |
| - | Exibe saída | `"Percentual de votos em branco: 10.00%"` |  |
| - | Exibe saída | `"Percentual de votos nulos: 20.00%"` |  |
| - | Exibe saída | `"Percentual de votos válidos: 70.00%"` |  |

---

## 📝 **Teste de Mesa 2 - Sem Votos em Branco**

📌 **Entrada:**

```

Digite o total de votos em branco: 0
Digite o total de votos nulos: 500
Digite o total de votos válidos: 500

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 0 | Usuário digita votos brancos | `brancos` | 0 |
| 500 | Usuário digita votos nulos | `nulos` | 500 |
| 500 | Usuário digita votos válidos | `validos` | 500 |
| - | Calcula total de eleitores | `totalEleitores = 0 + 500 + 500` | **1000** |
| - | Calcula percentual de votos em branco | `(0 * 100) / 1000` | **0.00%** |
| - | Calcula percentual de votos nulos | `(500 * 100) / 1000` | **50.00%** |
| - | Calcula percentual de votos válidos | `(500 * 100) / 1000` | **50.00%** |
| - | Exibe saída | `"Total de eleitores: 1000.00"` |  |
| - | Exibe saída | `"Percentual de votos em branco: 0.00%"` |  |
| - | Exibe saída | `"Percentual de votos nulos: 50.00%"` |  |
| - | Exibe saída | `"Percentual de votos válidos: 50.00%"` |  |

---

## 📝 **Teste de Mesa 3 - Total Pequeno**

📌 **Entrada:**

```

Digite o total de votos em branco: 2
Digite o total de votos nulos: 3
Digite o total de votos válidos: 5

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 2 | Usuário digita votos brancos | `brancos` | 2 |
| 3 | Usuário digita votos nulos | `nulos` | 3 |
| 5 | Usuário digita votos válidos | `validos` | 5 |
| - | Calcula total de eleitores | `totalEleitores = 2 + 3 + 5` | **10** |
| - | Calcula percentual de votos em branco | `(2 * 100) / 10` | **20.00%** |
| - | Calcula percentual de votos nulos | `(3 * 100) / 10` | **30.00%** |
| - | Calcula percentual de votos válidos | `(5 * 100) / 10` | **50.00%** |
| - | Exibe saída | `"Total de eleitores: 10.00"` |  |
| - | Exibe saída | `"Percentual de votos em branco: 20.00%"` |  |
| - | Exibe saída | `"Percentual de votos nulos: 30.00%"` |  |
| - | Exibe saída | `"Percentual de votos válidos: 50.00%"` |  |
</details>

<details>
  <summary>💻 Exercício 3</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise3.java>Código exercício 3</a>

  ## 📝 **Teste de Mesa 1 - Aumento de 10%**

📌 **Entrada:**

```

Digite seu salário atual: R$ 2000.00
Digite o percentual de aumento: 10

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 2000.00 | Usuário digita salário atual | `salarioAtual` | 2000.00 |
| 10 | Usuário digita percentual de aumento | `percentualAumento` | 10.00 |
| - | Calcula novo salário | `novoSalario = 2000 + (2000 * 0.10)` | **2200.00** |
| - | Exibe saída | `"Seu salario atual é de: R$2000.00"` |  |
| - | Exibe saída | `"Seu novo salário é de: R$2200.00"` |  |
| - | Exibe saída | `"O percentual de aumento foi de: 10.00%"` |  |

---

## 📝 **Teste de Mesa 2 - Aumento de 25.5%**

📌 **Entrada:**

```

Digite seu salário atual: R$ 3000.00
Digite o percentual de aumento: 25.5

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 3000.00 | Usuário digita salário atual | `salarioAtual` | 3000.00 |
| 25.5 | Usuário digita percentual de aumento | `percentualAumento` | 25.50 |
| - | Calcula novo salário | `novoSalario = 3000 + (3000 * 0.255)` | **3765.00** |
| - | Exibe saída | `"Seu salario atual é de: R$3000.00"` |  |
| - | Exibe saída | `"Seu novo salário é de: R$3765.00"` |  |
| - | Exibe saída | `"O percentual de aumento foi de: 25.50%"` |  |

---

## 📝 **Teste de Mesa 3 - Aumento de 5.75%**

📌 **Entrada:**

```

Digite seu salário atual: R$ 4500.50
Digite o percentual de aumento: 5.75

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 4500.50 | Usuário digita salário atual | `salarioAtual` | 4500.50 |
| 5.75 | Usuário digita percentual de aumento | `percentualAumento` | 5.75 |
| - | Calcula novo salário | `novoSalario = 4500.50 + (4500.50 * 0.0575)` | **4759.79** |
| - | Exibe saída | `"Seu salario atual é de: R$4500.50"` |  |
| - | Exibe saída | `"Seu novo salário é de: R$4759.79"` |  |
| - | Exibe saída | `"O percentual de aumento foi de: 5.75%"` |  |
</details>

<details>
  <summary>💻 Exercício 4</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise4.java>Código exercício 4</a> 

  ## 📝 **Teste de Mesa 1 - Valores Padrão**

📌 **Entrada:**

```

Digite o custo de fábrica do carro: R$ 50000.00
Digite o percentual do distribuidor: 28
Digite o percentual dos impostos: 45

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 50000.00 | Usuário digita custo de fábrica | `custoFabrica` | 50000.00 |
| 28 | Usuário digita percentual do distribuidor | `percentualDistribuidor` | 28.00 |
| 45 | Usuário digita percentual dos impostos | `percentualImpostos` | 45.00 |
| - | Calcula valor do distribuidor | `50000 * (28/100)` | **14000.00** |
| - | Calcula valor dos impostos | `50000 * (45/100)` | **22500.00** |
| - | Calcula custo final | `50000 + 14000 + 22500` | **86500.00** |
| - | Exibe saída | `"O custo final do carro ao consumidor é de: R$86500.00"` |  |
| - | Exibe saída | `"O valor dos impostos é de: R$22500.00"` |  |

---

## 📝 **Teste de Mesa 2 - Valores Diferentes**

📌 **Entrada:**

```

Digite o custo de fábrica do carro: R$ 30000.00
Digite o percentual do distribuidor: 20
Digite o percentual dos impostos: 35

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 30000.00 | Usuário digita custo de fábrica | `custoFabrica` | 30000.00 |
| 20 | Usuário digita percentual do distribuidor | `percentualDistribuidor` | 20.00 |
| 35 | Usuário digita percentual dos impostos | `percentualImpostos` | 35.00 |
| - | Calcula valor do distribuidor | `30000 * (20/100)` | **6000.00** |
| - | Calcula valor dos impostos | `30000 * (35/100)` | **10500.00** |
| - | Calcula custo final | `30000 + 6000 + 10500` | **46500.00** |
| - | Exibe saída | `"O custo final do carro ao consumidor é de: R$46500.00"` |  |
| - | Exibe saída | `"O valor dos impostos é de: R$10500.00"` |  |

---

## 📝 **Teste de Mesa 3 - Carro de Luxo**

📌 **Entrada:**

```

Digite o custo de fábrica do carro: R$ 100000.00
Digite o percentual do distribuidor: 35
Digite o percentual dos impostos: 50

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 100000.00 | Usuário digita custo de fábrica | `custoFabrica` | 100000.00 |
| 35 | Usuário digita percentual do distribuidor | `percentualDistribuidor` | 35.00 |
| 50 | Usuário digita percentual dos impostos | `percentualImpostos` | 50.00 |
| - | Calcula valor do distribuidor | `100000 * (35/100)` | **35000.00** |
| - | Calcula valor dos impostos | `100000 * (50/100)` | **50000.00** |
| - | Calcula custo final | `100000 + 35000 + 50000` | **185000.00** |
| - | Exibe saída | `"O custo final do carro ao consumidor é de: R$185000.00"` |  |
| - | Exibe saída | `"O valor dos impostos é de: R$50000.00"` |  |
</details>

<details>
  <summary>💻 Exercício 5</summary>
  
  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise5.java>Código exercício 5</a>

  ## 📝 **Teste de Mesa 1 - Cenário Normal**

📌 **Entrada:**

```

Digite o salário fixo do vendedor: R$ 2000.00
Digite quantos carros o vendedor vendeu: 5
Digite a comissão fixa para cada veículo vendido: R$ 300.00
Digite o valor total das vendas: R$ 50000.00

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 2000.00 | Usuário digita salário fixo | `salarioFixo` | 2000.00 |
| 5 | Usuário digita carros vendidos | `carrosVendidos` | 5 |
| 300.00 | Usuário digita comissão fixa por carro | `comissaoFixa` | 300.00 |
| 50000.00 | Usuário digita valor total das vendas | `valorVendas` | 50000.00 |
| - | Calcula comissão das vendas | `50000 * 0.05` | **2500.00** |
| - | Calcula comissão fixa | `5 * 300` | **1500.00** |
| - | Calcula salário final | `2000 + 1500 + 2500` | **6000.00** |
| - | Exibe saída | `"O salário final do vendedor é de: R$6000.00"` |  |

---

## 📝 **Teste de Mesa 2 - Vendedor não vendeu nenhum carro**

📌 **Entrada:**

```

Digite o salário fixo do vendedor: R$ 2500.00
Digite quantos carros o vendedor vendeu: 0
Digite a comissão fixa para cada veículo vendido: R$ 350.00
Digite o valor total das vendas: R$ 0.00

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 2500.00 | Usuário digita salário fixo | `salarioFixo` | 2500.00 |
| 0 | Usuário digita carros vendidos | `carrosVendidos` | 0 |
| 350.00 | Usuário digita comissão fixa por carro | `comissaoFixa` | 350.00 |
| 0.00 | Usuário digita valor total das vendas | `valorVendas` | 0.00 |
| - | Calcula comissão das vendas | `0 * 0.05` | **0.00** |
| - | Calcula comissão fixa | `0 * 350` | **0.00** |
| - | Calcula salário final | `2500 + 0 + 0` | **2500.00** |
| - | Exibe saída | `"O salário final do vendedor é de: R$2500.00"` |  |

---

## 📝 **Teste de Mesa 3 - Vendedor de alto desempenho**

📌 **Entrada:**

```

Digite o salário fixo do vendedor: R$ 1800.00
Digite quantos carros o vendedor vendeu: 12
Digite a comissão fixa para cada veículo vendido: R$ 500.00
Digite o valor total das vendas: R$ 120000.00

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 1800.00 | Usuário digita salário fixo | `salarioFixo` | 1800.00 |
| 12 | Usuário digita carros vendidos | `carrosVendidos` | 12 |
| 500.00 | Usuário digita comissão fixa por carro | `comissaoFixa` | 500.00 |
| 120000.00 | Usuário digita valor total das vendas | `valorVendas` | 120000.00 |
| - | Calcula comissão das vendas | `120000 * 0.05` | **6000.00** |
| - | Calcula comissão fixa | `12 * 500` | **6000.00** |
| - | Calcula salário final | `1800 + 6000 + 6000` | **13800.00** |
| - | Exibe saída | `"O salário final do vendedor é de: R$13800.00"` |  |
</details>

<details>
  <summary>💻 Exercício 6</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/main/src/Exercise6.java>Código exercício 6</a>

  ## 📝 **Teste de Mesa 1 - Teste com 212°F**

📌 **Entrada:**

```

Digite a temperatura em Fahrenheit: 212

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 212 | Usuário digita temperatura em Fahrenheit | `fahrenheit` | 212 |
| - | Calcula conversão | `(212 - 32) * 5/9` | **100.00** |
| - | Exibe saída | `"A temperatura em Celsius é de: 100.00°C"` |  |

---

## 📝 **Teste de Mesa 2 - Teste com 32°F (Ponto de Congelamento da Água)**

📌 **Entrada:**

```

Digite a temperatura em Fahrenheit: 32

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 32 | Usuário digita temperatura em Fahrenheit | `fahrenheit` | 32 |
| - | Calcula conversão | `(32 - 32) * 5/9` | **0.00** |
| - | Exibe saída | `"A temperatura em Celsius é de: 0.00°C"` |  |

---

## 📝 **Teste de Mesa 3 - Teste com 98.6°F (Temperatura do Corpo Humano)**

📌 **Entrada:**

```

Digite a temperatura em Fahrenheit: 98.6

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 98.6 | Usuário digita temperatura em Fahrenheit | `fahrenheit` | 98.6 |
| - | Calcula conversão | `(98.6 - 32) * 5/9` | **37.00** |
| - | Exibe saída | `"A temperatura em Celsius é de: 37.00°C"` |  |

---

## 📝 **Teste de Mesa 4 - Teste com -40°F (Temperatura onde Fahrenheit e Celsius se igualam)**

📌 **Entrada:**

```

Digite a temperatura em Fahrenheit: -40

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| -40 | Usuário digita temperatura em Fahrenheit | `fahrenheit` | -40 |
| - | Calcula conversão | `(-40 - 32) * 5/9` | **-40.00** |
| - | Exibe saída | `"A temperatura em Celsius é de: -40.00°C"` |  |
</details>

<details>
  <summary>💻 Exercício 7</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise7.java>Código exercício 7</a>

  ## 📝 **Teste de Mesa 1 - Teste com número maior que 10**

📌 **Entrada:**

```

Digite um número: 15

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 15 | Usuário digita número | `n` | 15 |
| - | Verifica condição | `15 > 10` | Verdadeiro |
| - | Exibe saída | `"É maior que 10!"` |  |

**🖨️ Saída no console:**

```

É maior que 10!

```

---

## 📝 **Teste de Mesa 2 - Teste com número menor que 10**

📌 **Entrada:**

```

Digite um número: 7

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 7 | Usuário digita número | `n` | 7 |
| - | Verifica condição | `7 > 10` | Falso |
| - | Exibe saída | `"Não é maior que 10!"` |  |

**🖨️ Saída no console:**

```

Não é maior que 10!

```

---

## 📝 **Teste de Mesa 3 - Teste com número igual a 10**

📌 **Entrada:**

```

Digite um número: 10

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 10 | Usuário digita número | `n` | 10 |
| - | Verifica condição | `10 > 10` | Falso |
| - | Exibe saída | `"Não é maior que 10!"` |  |
</details>

<details>
  <summary>💻 Exercício 8</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise8.java>Código exercício 8</a>

  ## 📝 **Teste de Mesa 1 - Teste com número positivo**

📌 **Entrada:**

```

Digite um número para descobrir se é positivo ou negativo: 8

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 8 | Usuário digita número | `n` | 8 |
| - | Verifica condição | `8 >= 0` | Verdadeiro |
| - | Exibe saída | `"O número é positivo!"` |  |

**🖨️ Saída no console:**

```

O número é positivo!

```

---

## 📝 **Teste de Mesa 2 - Teste com número negativo**

📌 **Entrada:**

```

Digite um número para descobrir se é positivo ou negativo: -5

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| -5 | Usuário digita número | `n` | -5 |
| - | Verifica condição | `-5 >= 0` | Falso |
| - | Exibe saída | `"O número é negativo!"` |  |

**🖨️ Saída no console:**

```

O número é negativo!

```

---

## 📝 **Teste de Mesa 3 - Teste com zero**

📌 **Entrada:**

```

Digite um número para descobrir se é positivo ou negativo: 0

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 0 | Usuário digita número | `n` | 0 |
| - | Verifica condição | `0 >= 0` | Verdadeiro |
| - | Exibe saída | `"O número é positivo!"` |  |

**🖨️ Saída no console:**

```

O número é positivo!

```
</details>

<details>
  <summary>💻 Exercício 9</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise9.java>Código exercício 9</a>

  ## 📝 **Teste de Mesa 1 - Teste com menos de 12 maçãs**

📌 **Entrada:**

```

Digite o número de maçãs compradas: 5

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 5 | Usuário digita número | `apples` | 5 |
| - | Verifica condição | `5 < 12` | Verdadeiro |
| - | Exibe saída | `"O custo total da compra é de: R$6.50"` |  |

**🖨️ Saída no console:**

```

O custo total da compra é de: R$6.50

```

---

## 📝 **Teste de Mesa 2 - Teste com 12 maçãs (justo no limite para desconto)**

📌 **Entrada:**

```

Digite o número de maçãs compradas: 12

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 12 | Usuário digita número | `apples` | 12 |
| - | Verifica condição | `12 < 12` | Falso |
| - | Exibe saída | `"O custo total da compra é de: R$12.00"` |  |

**🖨️ Saída no console:**

```

O custo total da compra é de: R$12.00

```

---

## 📝 **Teste de Mesa 3 - Teste com mais de 12 maçãs**

📌 **Entrada:**

```

Digite o número de maçãs compradas: 15

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 15 | Usuário digita número | `apples` | 15 |
| - | Verifica condição | `15 < 12` | Falso |
| - | Exibe saída | `"O custo total da compra é de: R$15.00"` |  |

**🖨️ Saída no console:**

```

O custo total da compra é de: R$15.00

```
</details>

<details>
  <summary>💻 Exercício 10</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise10.java>Código exercício 10</a>

## 📝 **Teste de Mesa**

📌 **Entrada:**

```

Digite a nota da primeira prova: 7.5
Digite a nota da segunda prova: 5.0

```

📊 **Passo a Passo:**

| Ação | Variável | Valor |
| --- | --- | --- |
| 7.5 | Usuário digita a nota da primeira prova | `firstGrade` |
| 5.0 | Usuário digita a nota da segunda prova | `secondGrade` |
| - | Calcula a média aritmética simples | `(7.5 + 5.0) / 2` |
| 6.25 | Verifica se a média é maior ou igual a 6 | `average >= 6` |
| - | Exibe mensagem de aprovação | `"O aluno foi aprovado com média: 6.25"` |

**🖨️ Saída no console:**

```

O aluno foi aprovado com média: 6.25

```
</details>

<details>
  <summary>💻 Exercício 11</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise11.java>Código exercício 11</a>

  📝 Teste de Mesa 1 - Pessoa pode votar
📌 Entrada:


Digite o ano de nascimento (no formato AAAA) para saber se você poderá votar este ano: 2000
📊 Passo a Passo:

Entrada	Ação	Variável	Valor
2000	Usuário digita ano de nascimento	birthYear	2000
2025	Ano atual (obtido com LocalDate.now().getYear())	actualYear	2025
-	Calcula idade	2025 - 2000	25
-	Verifica condição	25 >= 16	Verdadeiro
-	Exibe saída	"Você poderá votar este ano! Você tem: 25 anos."	
🖨️ Saída no console:


Você poderá votar este ano! Você tem: 25 anos.
📝 Teste de Mesa 2 - Pessoa não pode votar
📌 Entrada:


Digite o ano de nascimento (no formato AAAA) para saber se você poderá votar este ano: 2010
📊 Passo a Passo:

Entrada	Ação	Variável	Valor
2010	Usuário digita ano de nascimento	birthYear	2010
2025	Ano atual (obtido com LocalDate.now().getYear())	actualYear	2025
-	Calcula idade	2025 - 2010	15
-	Verifica condição	15 >= 16	Falso
-	Exibe saída	"Você não poderá votar este ano! Você tem apenas: 15 anos."	
🖨️ Saída no console:


Você não poderá votar este ano! Você tem apenas: 15 anos.
📝 Teste de Mesa 3 - Pessoa tem exatamente 16 anos
📌 Entrada:


Digite o ano de nascimento (no formato AAAA) para saber se você poderá votar este ano: 2009
📊 Passo a Passo:

Entrada	Ação	Variável	Valor
2009	Usuário digita ano de nascimento	birthYear	2009
2025	Ano atual (obtido com LocalDate.now().getYear())	actualYear	2025
-	Calcula idade	2025 - 2009	16
-	Verifica condição	16 >= 16	Verdadeiro
-	Exibe saída	"Você poderá votar este ano! Você tem: 16 anos."	
🖨️ Saída no console:


Você poderá votar este ano! Você tem: 16 anos.
</details>

<details>
  <summary>💻 Exercício 12</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise12.java>Código exercício 12</a>

  ## 📝 **Teste de Mesa 1 - Primeiro valor maior**

📌 **Entrada:**

```

Digite o primeiro valor: 15
Digite o segundo valor (diferente do primeiro): 10

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 15 | Usuário digita primeiro valor | `firstValue` | 15 |
| 10 | Usuário digita segundo valor | `secondValue` | 10 |
| - | Verifica se os valores são iguais | `firstValue == secondValue` | Falso |
| - | Compara os valores | `15 > 10` | Verdadeiro |
| - | Exibe saída | `"O primeiro valor é maior: 15"` |  |

**🖨️ Saída no console:**

```

O primeiro valor é maior: 15

```

---

## 📝 **Teste de Mesa 2 - Segundo valor maior**

📌 **Entrada:**

```

Digite o primeiro valor: 5
Digite o segundo valor (diferente do primeiro): 8

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 5 | Usuário digita primeiro valor | `firstValue` | 5 |
| 8 | Usuário digita segundo valor | `secondValue` | 8 |
| - | Verifica se os valores são iguais | `firstValue == secondValue` | Falso |
| - | Compara os valores | `5 > 8` | Falso |
| - | Exibe saída | `"O segundo valor é maior: 8"` |  |

**🖨️ Saída no console:**

```

O segundo valor é maior: 8

```

---

## 📝 **Teste de Mesa 3 - Valores iguais (validação de erro)**

📌 **Entrada:**

```

Digite o primeiro valor: 10
Digite o segundo valor (diferente do primeiro): 10
Você não entendeu que é um valor diferente do primeiro?
Vai, digita certo: 20

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 10 | Usuário digita primeiro valor | `firstValue` | 10 |
| 10 | Usuário digita segundo valor | `secondValue` | 10 |
| - | Verifica se os valores são iguais | `firstValue == secondValue` | Verdadeiro |
| - | Exibe mensagem de erro | `"Você não entendeu que é um valor diferente do primeiro?"` |  |
| 20 | Usuário corrige segundo valor | `secondValue` | 20 |
| - | Verifica novamente se os valores são iguais | `firstValue == secondValue` | Falso |
| - | Compara os valores | `10 > 20` | Falso |
| - | Exibe saída | `"O segundo valor é maior: 20"` |  |

**🖨️ Saída no console:**

```

Você não entendeu que é um valor diferente do primeiro?
Vai, digita certo:
O segundo valor é maior: 20

```
</details>

<details>
  <summary>💻 Exercício 13</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise13.java>Código exercício 13</a>

  ## 📝 **Teste de Mesa 1 - Primeiro valor menor**

📌 **Entrada:**

```

Digite o primeiro valor: 5
Digite o segundo valor (diferente do primeiro): 10

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 5 | Usuário digita primeiro valor | `firstValue` | 5 |
| 10 | Usuário digita segundo valor | `secondValue` | 10 |
| - | Verifica se os valores são iguais | `firstValue == secondValue` | Falso |
| - | Compara os valores | `5 < 10` | Verdadeiro |
| - | Exibe saída | `"Os valores em ordem crescente são: 5 e 10"` |  |

**🖨️ Saída no console:**

```

Os valores em ordem crescente são: 5 e 10

```

---

## 📝 **Teste de Mesa 2 - Segundo valor menor**

📌 **Entrada:**

```

Digite o primeiro valor: 15
Digite o segundo valor (diferente do primeiro): 10

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 15 | Usuário digita primeiro valor | `firstValue` | 15 |
| 10 | Usuário digita segundo valor | `secondValue` | 10 |
| - | Verifica se os valores são iguais | `firstValue == secondValue` | Falso |
| - | Compara os valores | `15 > 10` | Verdadeiro |
| - | Exibe saída | `"Os valores em ordem crescente são: 10 e 15"` |  |

**🖨️ Saída no console:**

```

Os valores em ordem crescente são: 10 e 15

```

---

## 📝 **Teste de Mesa 3 - Valores iguais (validação de erro)**

📌 **Entrada:**

```

Digite o primeiro valor: 10
Digite o segundo valor (diferente do primeiro): 10
Você não entendeu que é um valor diferente do primeiro?
Vai, digita certo: 20

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 10 | Usuário digita primeiro valor | `firstValue` | 10 |
| 10 | Usuário digita segundo valor | `secondValue` | 10 |
| - | Verifica se os valores são iguais | `firstValue == secondValue` | Verdadeiro |
| - | Exibe mensagem de erro | `"Você não entendeu que é um valor diferente do primeiro?"` |  |
| 20 | Usuário corrige segundo valor | `secondValue` | 20 |
| - | Verifica novamente se os valores são iguais | `firstValue == secondValue` | Falso |
| - | Compara os valores | `10 < 20` | Verdadeiro |
| - | Exibe saída | `"Os valores em ordem crescente são: 10 e 20"` |  |

**🖨️ Saída no console:**

```

Você não entendeu que é um valor diferente do primeiro?
Vai, digita certo:
Os valores em ordem crescente são: 10 e 20

```
</details>

<details>
  <summary>💻 Exercício 14</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise14.java>Código exercício 14</a>

## 📝 **Teste de Mesa 1 - Cálculo da Duração do Jogo de Xadrez**

📌 **Entrada:**

```

Digite a hora inicial do jogo: 9
Digite a hora final do jogo: 15

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 9 | Usuário digita a hora inicial do jogo | `gameStart` | 9 |
| 15 | Usuário digita a hora final do jogo | `gameEnd` | 15 |
| - | Verifica se a hora final é maior que a hora inicial | `gameEnd > gameStart` | Verdadeiro |
| - | Calcula a duração do jogo: `gameEnd - gameStart` | `totalDuration` | 6 |
| - | Exibe a duração do jogo | Saída | `"A duração do jogo foi de: 6 horas"` |

**🖨️ Saída no console:**

```

A duração do jogo foi de: 6 horas

```

---

## 📝 **Teste de Mesa 2 - Cálculo da Duração do Jogo de Xadrez (hora final menor que hora inicial)**

📌 **Entrada:**

```

Digite a hora inicial do jogo: 23
Digite a hora final do jogo: 5

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 23 | Usuário digita a hora inicial do jogo | `gameStart` | 23 |
| 5 | Usuário digita a hora final do jogo | `gameEnd` | 5 |
| - | Verifica se a hora final é maior que a hora inicial | `gameEnd > gameStart` | Falso |
| - | Calcula a duração do jogo: `(24 - gameStart) + gameEnd` | `totalDuration` | 6 |
| - | Exibe a duração do jogo | Saída | `"A duração do jogo foi de: 6 horas"` |

**🖨️ Saída no console:**

```

A duração do jogo foi de: 6 horas

```
</details>

<details>
  <summary>💻 Exercício 15</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise15.java>Código exercício 15</a>

  ## 📝 **Teste de Mesa 1 - Cálculo de Salário com Horas Extras (horas trabalhadas superiores a 40 horas)**

📌 **Entrada:**

```

Digite o número de horas trabalhadas no mês: 180
Digite o valor das horas trabalhadas: 15

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 180 | Usuário digita o número de horas trabalhadas | `horasTrabalhadas` | 180 |
| 15 | Usuário digita o valor da hora trabalhada | `valorHora` | 15 |
| - | Verifica se as horas trabalhadas são maiores que as horas normais | `horasTrabalhadas > horasNormais` | Verdadeiro |
| - | Calcula as horas extras: `horasTrabalhadas - horasNormais` | `horasExtras` | 140 |
| - | Calcula o salário: `(40*4*valorHora) + (horasExtras*valorHora*rateHoraExtra)` | `salario` | 8100.00 |
| - | Exibe a mensagem com o salário total e as horas extras | Saída | `"O salário total do funcionário é: R$8100.00"` |
| - | Exibe a quantidade de horas extras | Saída | `"O funcionário trabalhou 140 horas extras"` |

**🖨️ Saída no console:**

```

O salário total do funcionário é: R$8100.00
O funcionário trabalhou 140 horas extras

```

---

## 📝 **Teste de Mesa 2 - Cálculo de Salário sem Horas Extras (horas trabalhadas menores ou iguais a 40 horas)**

📌 **Entrada:**

```

Digite o número de horas trabalhadas no mês: 160
Digite o valor das horas trabalhadas: 12

```

📊 **Passo a Passo:**

| Entrada | Ação | Variável | Valor |
| --- | --- | --- | --- |
| 160 | Usuário digita o número de horas trabalhadas | `horasTrabalhadas` | 160 |
| 12 | Usuário digita o valor da hora trabalhada | `valorHora` | 12 |
| - | Verifica se as horas trabalhadas são maiores que as horas normais | `horasTrabalhadas > horasNormais` | Falso |
| - | Calcula o salário: `horasTrabalhadas * valorHora` | `salario` | 1920.00 |
| - | Exibe a mensagem com o salário total e sem horas extras | Saída | `"O salário total do funcionário é: R$1920.00"` |
| - | Exibe que o funcionário não teve horas extras | Saída | `"O funcionário não teve horas extras"` |

**🖨️ Saída no console:**

```

O salário total do funcionário é: R$1920.00
O funcionário não teve horas extras

```

</details>

<details>
  <summary>💻 Exercício 16</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise16.java>Código exercício 16</a>
  
  ## 📝 **Teste de Mesa**

📌 **Entrada:**
Não há entrada, pois os valores de gastos de janeiro, fevereiro e março já estão definidos diretamente no código.

📊 **Passo a Passo:**

| Ação | Variável | Valor |
| --- | --- | --- |
| Inicializa o gasto de janeiro: `15000` | `janeiro` | 15000.00 |
| Inicializa o gasto de fevereiro: `23000` | `fevereiro` | 23000.00 |
| Inicializa o gasto de março: `17000` | `marco` | 17000.00 |
| Calcula o gasto total: `janeiro + fevereiro + marco` | `total` | 55000.00 |
| Calcula a média mensal de gastos: `total / 3` | `media` | 18333.33 |
| Exibe os gastos de janeiro, fevereiro e março | Saída | `"Gastos de Janeiro: R$15000.00"` |
| Exibe os gastos de fevereiro e março | Saída | `"Gastos de Fevereiro: R$23000.00"` |
| Exibe os gastos de março | Saída | `"Gastos de Março: R$17000.00"` |
| Exibe o gasto total do trimestre | Saída | `"O gasto total do trimestre foi de R$55000.00"` |
| Exibe a média mensal de gastos | Saída | `"A média mensal de gastos foi de R$18333.33"` |

**🖨️ Saída no console:**

```

Gastos de Janeiro: R$15000.00
Gastos de Fevereiro: R$23000.00
Gastos de Março: R$17000.00

O gasto total do trimestre foi de R$55000.00
A média mensal de gastos foi de R$18333.33

```
  
</details>

<details>
  <summary>💻 Exercício 17</summary>

  ## :dart: <a href = https://github.com/dievit/BD-LP1/blob/main/src/Exercise17.java>Código exercício 17</a>

  ## 📝 **Teste de Mesa**

📌 **Entrada:**

```

Digite o valor da P1: 7.5
Digite o valor da E1: 8.0
Digite o valor da E2: 6.5
Digite o valor da API: 9.0
Digite o valor de X: 1.0
Digite o valor da SUB(se houver): 0.0

```

📊 **Passo a Passo:**

| Ação | Variável | Valor |
| --- | --- | --- |
| 7.5 | Usuário digita o valor de P1 | `P1` |
| 8.0 | Usuário digita o valor de E1 | `E1` |
| 6.5 | Usuário digita o valor de E2 | `E2` |
| 9.0 | Usuário digita o valor de API | `API` |
| 1.0 | Usuário digita o valor de X | `X` |
| 0.0 | Usuário digita o valor de SUB | `SUB` |
| - | Calcula a média ponderada para P1, E1, E2 | `P1*0.6 + ((E1+E2)/2)*0.4` |
| - | Calcula o primeiro termo da fórmula da média | `(7.0*0.5)` |
| - | Calcula a diferença entre o valor da média e 5.9 | `(7.0-5.9)` |
| - | Aplica a fórmula para o segundo termo da média | `Math.max(1.1, 0)` |
| - | Calcula o segundo termo de acordo com API | `(1.1/1.1)*(API*0.5)` |
| - | Soma os valores de X e SUB | `X + (SUB*0.3)` |
| - | Calcula a média final | `3.5 + 4.5 + 1.0` |

**🖨️ Saída no console:**

```

A média do aluno é: 9.0

```
</details>
