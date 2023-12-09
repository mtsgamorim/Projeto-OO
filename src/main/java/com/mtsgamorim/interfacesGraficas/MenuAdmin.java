package com.mtsgamorim.interfacesGraficas;

import com.mtsgamorim.Etapas.EtapasProcessoSeletivo;
import com.mtsgamorim.enderecos.EnderecoFilial;
import com.mtsgamorim.enderecos.EnderecoResidencial;
import com.mtsgamorim.lojaamorimrh.Candidatura;
import com.mtsgamorim.lojaamorimrh.Colaborador;
import com.mtsgamorim.lojaamorimrh.Loja;
import com.mtsgamorim.lojaamorimrh.ProcessoSeletivo;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


// Matheus Amorim Garcia Santos - 201765142AC
public class MenuAdmin extends JFrame implements Logout{

    private List<Loja> lojas;
    private DefaultListModel<Loja> lojasListModel;
    private List<Colaborador> colaboradores;
    private DefaultListModel<Colaborador> colaboradoresListModel;
    private JList<Colaborador> colaboradoresJList;
    private List<ProcessoSeletivo> processosSeletivos;
    private DefaultListModel<ProcessoSeletivo> processosSeletivosListModel;
    private JList<ProcessoSeletivo> processosSeletivosJList;
    private List<Candidatura> candidaturas;
    private DefaultListModel<Candidatura> candidaturasListModel;
    private JList<Candidatura> candidaturasJList;
    private InterfaceLoginCadastro interfaceLoginCadastro;

    public MenuAdmin(List<Loja> lojas, List<Candidatura> candidaturas, List<Colaborador> colaboradores, List<ProcessoSeletivo> processosSeletivos) {
        this.lojas = lojas;
        lojasListModel = new DefaultListModel<>();
        for(int i = 0; i < lojas.size(); i++){
            this.lojasListModel.addElement(lojas.get(i));
        }
        
        this.colaboradores = colaboradores;
        colaboradoresListModel = new DefaultListModel<>();
        for(int i = 0; i < colaboradores.size(); i++){
            this.colaboradoresListModel.addElement(colaboradores.get(i));
        }
        
        this.processosSeletivos = processosSeletivos;
        processosSeletivosListModel = new DefaultListModel<>();
        for(int i = 0; i < processosSeletivos.size(); i++){
            this.processosSeletivosListModel.addElement(processosSeletivos.get(i));
        }
        
        this.candidaturas = candidaturas;
        candidaturasListModel = new DefaultListModel<>();
        for(int i = 0; i < candidaturas.size(); i++){
            this.candidaturasListModel.addElement(candidaturas.get(i));
        }

        setTitle("Menu Administrativo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu lojasMenu = new JMenu("Configurar Lojas");
        JMenu colaboradoresMenu = new JMenu("Configurar Colaboradores");
        JMenu processosSeletivosMenu = new JMenu("Configurar Processos Seletivos");
        JMenu candidaturasMenu = new JMenu("Configurar Candidaturas");
        
        menuBar.add(lojasMenu);
        menuBar.add(colaboradoresMenu);
        menuBar.add(processosSeletivosMenu);
        menuBar.add(candidaturasMenu);

        JMenuItem adicionarLojaItem = new JMenuItem("Adicionar Loja");
        JMenuItem visualizarLojasItem = new JMenuItem("Visualizar Lojas");

        JMenuItem adicionarColaboradorItem = new JMenuItem("Adicionar Colaborador");
        JMenuItem visualizarColaboradoresItem = new JMenuItem("Visualizar Colaboradores");
        
        JMenuItem adicionarProcessoSeletivoItem = new JMenuItem("Adicionar Processo Seletivo");
        JMenuItem visualizarProcessosSeletivosItem = new JMenuItem("Visualizar Processos Seletivos");
        
        JMenuItem visualizarCandidaturasItem = new JMenuItem("Visualizar Candidaturas");

        lojasMenu.add(adicionarLojaItem);
        lojasMenu.add(visualizarLojasItem);
        colaboradoresMenu.add(adicionarColaboradorItem);
        colaboradoresMenu.add(visualizarColaboradoresItem);
        processosSeletivosMenu.add(adicionarProcessoSeletivoItem);
        processosSeletivosMenu.add(visualizarProcessosSeletivosItem);
        candidaturasMenu.add(visualizarCandidaturasItem);

        adicionarLojaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarLoja();
            }
        });

        visualizarLojasItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarLojas();
            }
        });

        adicionarColaboradorItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarColaborador();
            }
        });

        visualizarColaboradoresItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarColaboradores();
            }
        });
        
        adicionarProcessoSeletivoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarProcessoSeletivo();
            }
        });

        visualizarProcessosSeletivosItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarProcessosSeletivos();
            }
        });
        
        visualizarCandidaturasItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarCandidaturas();
            }
        });
        
        JButton btnLogout = new JButton("Logout");
        
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fazerLogout();
            }
        });

        menuBar.add(btnLogout);
    }
    
    @Override
    public void fazerLogout() {
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja realmente fazer logout?", "Confirmar Logout", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    
    private void adicionarLoja() {
        String nome = JOptionPane.showInputDialog(this, "Digite o nome da loja:");
        if (nome != null && !nome.isEmpty()) {
            String cep = JOptionPane.showInputDialog(this, "Digite o CEP:");
            String cidade = JOptionPane.showInputDialog(this, "Digite a cidade:");
            String estado = JOptionPane.showInputDialog(this, "Digite o estado:");

            EnderecoFilial endereco = new EnderecoFilial(cep, cidade, estado);

            Loja novaLoja = new Loja(nome, endereco);
            lojas.add(novaLoja);
            JOptionPane.showMessageDialog(this, "Loja adicionada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Nome da loja inválido.");
        }
    }

    
    private void visualizarLojas() {
        JList<Loja> lojasJList = new JList<>(lojasListModel);
        lojasJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(lojasJList);

        JButton btnRemover = new JButton("Remover Lojas Selecionadas");
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerLojasSelecionadas(lojasJList.getSelectedIndices());
            }
        });

        JButton btnVoltar = new JButton("Voltar ao Menu Admin");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(btnVoltar).dispose();
                setVisible(true);
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnRemover, BorderLayout.SOUTH);
        panel.add(btnVoltar, BorderLayout.NORTH);

        JFrame frame = new JFrame("Visualizar Lojas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }
    
    private void removerLojasSelecionadas(int[] indicesSelecionados) {
        for (int i = indicesSelecionados.length - 1; i >= 0; i--) {
            int index = indicesSelecionados[i];
            lojasListModel.remove(index);
            lojas.remove(index);
        }
        JOptionPane.showMessageDialog(this, "Lojas removidas com sucesso!");
    }

   private void adicionarColaborador() {
        String nome = JOptionPane.showInputDialog(this, "Digite o nome do colaborador:");
        if (nome != null && !nome.isEmpty()) {
            String idadeStr = JOptionPane.showInputDialog(this, "Digite a idade:");
            int idade = Integer.parseInt(idadeStr);

            String cpf = JOptionPane.showInputDialog(this, "Digite o CPF:");

            String cep = JOptionPane.showInputDialog(this, "Digite o CEP do endereço:");
            String cidade = JOptionPane.showInputDialog(this, "Digite a cidade do endereço:");
            String estado = JOptionPane.showInputDialog(this, "Digite o estado do endereço:");
            
            String telefone = JOptionPane.showInputDialog(this, "Digite o telefone:");

            EnderecoResidencial endereco = new EnderecoResidencial(cep, cidade, estado);

            String cargo = JOptionPane.showInputDialog(this, "Digite o cargo:");
            String salarioStr = JOptionPane.showInputDialog(this, "Digite o salário:");
            double salario = Double.parseDouble(salarioStr);

            if (lojas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não há lojas cadastradas. Impossível adicionar colaborador.");
                return;
            }

            Loja lojaSelecionada = selecionarLoja();

            if (lojaSelecionada == null) {
                JOptionPane.showMessageDialog(this, "Loja não selecionada. Impossível adicionar colaborador.");
                return;
            }

            Colaborador novoColaborador = new Colaborador(nome, idade, cpf, telefone, endereco, cargo, salario, lojaSelecionada);

            colaboradores.add(novoColaborador);
            colaboradoresListModel.addElement(novoColaborador);
            JOptionPane.showMessageDialog(this, "Colaborador adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Nome do colaborador inválido.");
        }
    }
    
    private Loja selecionarLoja() {
        if (lojas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há lojas cadastradas.");
            return null;
        }

        Loja[] lojasArray = lojas.toArray(new Loja[0]);
        Loja lojaSelecionada = (Loja) JOptionPane.showInputDialog(
                this,
                "Selecione uma loja:",
                "Seleção de Loja",
                JOptionPane.QUESTION_MESSAGE,
                null,
                lojasArray,
                lojasArray[0]
        );
        
        return lojaSelecionada;
    }

    private void visualizarColaboradores() {
        colaboradoresJList = new JList<>(colaboradoresListModel);
        colaboradoresJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(colaboradoresJList);

        JButton btnRemover = new JButton("Remover Colaboradores Selecionados");
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerColaboradoresSelecionados();
            }
        });

        JButton btnVoltar = new JButton("Voltar ao Menu Admin");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(btnVoltar).dispose();
                setVisible(true);
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnRemover, BorderLayout.SOUTH);
        panel.add(btnVoltar, BorderLayout.NORTH);

        JFrame frame = new JFrame("Visualizar Colaboradores");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    private void removerColaboradoresSelecionados() {
        int[] indicesSelecionados = colaboradoresJList.getSelectedIndices();
        for (int i = indicesSelecionados.length - 1; i >= 0; i--) {
            int index = indicesSelecionados[i];
            colaboradoresListModel.remove(index);
            colaboradores.remove(index);
        }
        JOptionPane.showMessageDialog(this, "Colaboradores removidos com sucesso!");
    }
    
    private void adicionarProcessoSeletivo() {
        String cargo = JOptionPane.showInputDialog(this, "Digite o cargo do processo seletivo:");
        if (cargo != null && !cargo.isEmpty()) {
            if (lojas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Não há lojas cadastradas. Impossível adicionar processo seletivo.");
                return;
            }

            Loja lojaSelecionada = selecionarLoja();

            if (lojaSelecionada == null) {
                JOptionPane.showMessageDialog(this, "Loja não selecionada. Impossível adicionar processo seletivo.");
                return;
            }

            ProcessoSeletivo novoProcessoSeletivo = new ProcessoSeletivo(cargo, lojaSelecionada);

            processosSeletivos.add(novoProcessoSeletivo);
            processosSeletivosListModel.addElement(novoProcessoSeletivo);
            JOptionPane.showMessageDialog(this, "Processo seletivo adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "Cargo do processo seletivo inválido.");
        }
    }

    private void visualizarProcessosSeletivos() {
        processosSeletivosJList = new JList<>(processosSeletivosListModel);
        processosSeletivosJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(processosSeletivosJList);

        JButton btnRemover = new JButton("Remover Processos Seletivos Selecionados");
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerProcessosSeletivosSelecionados();
            }
        });

        JButton btnVoltar = new JButton("Voltar ao Menu Admin");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(btnVoltar).dispose();
                setVisible(true);
            }
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnRemover, BorderLayout.SOUTH);
        panel.add(btnVoltar, BorderLayout.NORTH);

        JFrame frame = new JFrame("Visualizar Processos Seletivos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }

    private void removerProcessosSeletivosSelecionados() {
        int[] indicesSelecionados = processosSeletivosJList.getSelectedIndices();
        for (int i = indicesSelecionados.length - 1; i >= 0; i--) {
            int index = indicesSelecionados[i];
            processosSeletivosListModel.remove(index);
            processosSeletivos.remove(index);
        }
        JOptionPane.showMessageDialog(this, "Processos seletivos removidos com sucesso!");
    }
    
    private void visualizarCandidaturas() {
        candidaturasJList = new JList<>(candidaturasListModel);
        candidaturasJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(candidaturasJList);

        JPanel buttonPanel = new JPanel(new FlowLayout());  // Novo painel para os botões
        JButton btnAvancarEtapa = new JButton("Avançar Etapa");
        btnAvancarEtapa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avancarEtapaCandidatura();
            }
        });

        JButton btnReprovarCandidato = new JButton("Reprovar Candidato");
        btnReprovarCandidato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reprovarCandidato();
            }
        });

        buttonPanel.add(btnAvancarEtapa);
        buttonPanel.add(btnReprovarCandidato);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);  // Adiciona o novo painel com os botões

        JButton btnVoltar = new JButton("Voltar ao Menu Admin");
        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(btnVoltar).dispose();
                setVisible(true);
            }
        });

        mainPanel.add(btnVoltar, BorderLayout.NORTH);

        JFrame frame = new JFrame("Visualizar Candidaturas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
    }
    private void avancarEtapaCandidatura() {
        int selectedIndex = candidaturasJList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < candidaturas.size()) {
            Candidatura candidaturaSelecionada = candidaturas.get(selectedIndex);

            String etapaAtual = candidaturaSelecionada.getEtapaProcesso();

            EtapasProcessoSeletivo etapasProcessoSeletivo = new EtapasProcessoSeletivo();
            etapasProcessoSeletivo.setEtapaAtual(etapaAtual);

            etapasProcessoSeletivo.avancarEtapa();

            candidaturaSelecionada.setEtapaProcesso(etapasProcessoSeletivo.getEtapaAtual());

            candidaturasListModel.setElementAt(candidaturaSelecionada, selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma candidatura para avançar a etapa.");
        }
    }
    
    private void reprovarCandidato() {
        int selectedIndex = candidaturasJList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < candidaturas.size()) {
            Candidatura candidaturaReprovada = candidaturas.remove(selectedIndex);
            candidaturasListModel.remove(selectedIndex);
            JOptionPane.showMessageDialog(this, "Candidato reprovado:\n" + candidaturaReprovada);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma candidatura para reprovar.");
        }
    }
}