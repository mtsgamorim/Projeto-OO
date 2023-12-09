# Projeto-OO

## Introdução
  Esse projeto funciona como um sistema de RH para uma franquia de lojas. Existem dois tipos de login, o de administrador e o login de candidato. O login de administrador possui poderes para cadastrar todas as informações do sistema, além de visualizar suas candidaturas a
aprova-las. O login de candidato permite ele visualizar os processos seletivos que estão abertos no momento, e assim se inscrever em um processo seletivo.

## Fluxo
  Para logar como admin, utilize o usuario: 'admin' e senha: 'admin'.  
  Na tela que abrir, é possível CRIAR uma loja preenchendo os dados que forem aparecendo, e depois é possível visualiza-la e até mesmo exclui-la.  
  Todas essas mesmas opçoes se encontram para Processo seletivo e colaboradores. Para candidatos, só é possivel exclui-los(reprovar) e avançar ele de etapa no processo, não é possível cria-lo.  
  Ao terminar de criar tudo, utilize o botão LOGOUT para sair e entrar como um usuário normal.  
  Na tela de usúario, é possível visualizar a lista de processos seletivos, e com isso se cadastrar em um processo, gerando assim sua candidatura para o ADMIN controla-la.  
  Utilize o LOGOUT para verificar como esta a tela de candidaturas

## Tecnologias e conceitos aplicados:
 Para interface gráfica, foi utilizado o SWING e o JOption.  
 Todo o projeto é escrito em JAVA e é orientado a objeto.  
 Não existe persistencia de dados, ao fechar a aplicação, todos os dados são perdidos, exceto o login de ADMIN.  
 A classe pessoa é ABSTRATA, e a classe colaborador e candidatura a implementam.  
 A classe endereço é ABSTRATA, e a classe EnderecoFilial e EnderecoResidencial a implementam.  
 Existe algumas tratativas de exceção para essas duas classes citadas acima.  
 A classe LOGOUT é uma interface para obrigar os menus de ADMIN e de USUARIO a terem uma implementação para sair de suas contas.


