import http from "node:http";
/*
    Permite a transferência de dados pelo protocolo HTTP 
    Criação de servidores
    Manipulação de requisições dos clientes
    Providencia respostas às requisições
*/

const PORT = 8000;

const server = http.createServer((req, res) => {
  /*O objeto request:
            Dá acesso à url, headers, dados e método da requisição
    */
    if(req.method === "GET"){
        res.end("Get method")
    }

  if (req.url === "/api") {
    /*O objeto response:
                especifica o content-type
                determina o status code (200,400,404 e etc.)
                providencia o conteúdo (html, json, imagens e etc.)
        */
    res.write("Hello from the server!");

    //Método que envia uma mensagem e encerra a resposta
    //É obrigatório para que o navegador saiba que a resposta terminou
    res.end("\nGoodbye from the server!");
  }
});

server.listen(PORT, () => console.log(`Server running on port: ${PORT}`));
