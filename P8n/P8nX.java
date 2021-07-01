import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Container;
import javax.swing.table.*;
import java.lang.NumberFormatException;
import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class P8nX extends JApplet implements ActionListener {
   MinhaListaOrdenavel lista;
   JButton nome,data, altura, imc, sexo, peso, cadastrar;
   JPanel grupoBotaoSort;
   JComboBox botaoDeSelecao;
   String[] botaoDeSelecaoString = {"Selecione", "Masculino", "Feminino"};
   JLabel labelNome, labelAltura, labelPeso, labelSexo, labelData;
   JTextField campoNome, campoAltura, campoPeso, campoData;
   JPanel grupoTexto, grupoNomeData, grupoPesoAltura, grupoSexo, grupoGrid;
   Panel p;
   Container cp;
   SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
   DefaultTableModel model = new DefaultTableModel() {
      @Override
      public boolean isCellEditable(int row, int column) {
         return false;
      }
   };
   JTable dadosIMC;
   int nomeR = 0, pesoR = 0, imcR = 0, sexoR = 0, alturaR = 0, dataR = 0;

    public void init() {
        //botoes
        model.addColumn("Nome");
        model.addColumn("Data de Nascimento");
        model.addColumn("Altura");
        model.addColumn("Peso");
        model.addColumn("Sexo");
        model.addColumn("IMC");
        model.addColumn("Diagnostico");
        dadosIMC = new JTable(model);
        lista = new MinhaListaOrdenavel();
        lista.add(new Homem("Bruno", "28/08/2000", 65.6, 1.71));
        lista.add(new Mulher("Anna", "14/02/1993", 55.7, 1.51));
        lista.add(new Mulher("Laura", "23/05/1999", 60, 1.65));
        lista.add(new Mulher("Sophia", "01/09/2005", 45.9, 1.65));
        lista.add(new Homem("Yuri", "12/07/2001", 57.8, 1.55));
        lista.add(new Mulher("Valentina", "13/11/1965", 64.3, 1.65));
        lista.add(new Homem("Davi", "25/04/1990", 100, 1.75));
        lista.add(new Homem("Samuel", "22/07/2003", 20, 1.80));
        lista.add(new Mulher("Cecilia", "03/11/2010", 50, 1.60));
        lista.add(new Homem("Lorenzo", "05/10/1987", 57, 1.76));
        nome = new JButton("Nome");
        nome.addActionListener(this);
        data = new JButton("Data");
        data.addActionListener(this);
        altura = new JButton("Altura");
        altura.addActionListener(this);
        peso = new JButton("Peso");
        peso.addActionListener(this);
        sexo = new JButton("Sexo");
        sexo.addActionListener(this);
        imc = new JButton("IMC");
        imc.addActionListener(this);
        grupoBotaoSort = new JPanel();
        grupoBotaoSort.add(nome);
        grupoBotaoSort.add(data);
        grupoBotaoSort.add(altura);
        grupoBotaoSort.add(peso);
        grupoBotaoSort.add(sexo);
        grupoBotaoSort.add(imc);
        //Cria um painel agrupando um Label e um Campo de Texto
        grupoTexto = new JPanel();
        grupoTexto.setLayout(new BoxLayout(grupoTexto, BoxLayout.Y_AXIS));
        //grupo nome e data
        grupoNomeData = new JPanel();
        grupoNomeData.setLayout(new BoxLayout(grupoNomeData, BoxLayout.Y_AXIS));
        labelNome = new JLabel("Nome: ");
        campoNome = new JTextField(15);
        campoNome.addActionListener(this);
        grupoNomeData.add(labelNome);
        grupoNomeData.add(campoNome);
        labelData = new JLabel("Data de Nascimento (dd/mm/aaaa): ");
        campoData = new JTextField(15);
        campoData.addActionListener(this);
        grupoNomeData.add(labelData);
        grupoNomeData.add(campoData);
        grupoTexto.add(grupoNomeData);
        //grupo peso e altura
        grupoPesoAltura = new JPanel();
        grupoPesoAltura.setLayout(new BoxLayout(grupoPesoAltura, BoxLayout.Y_AXIS));
        labelAltura = new JLabel("Altura (m): ");
        campoAltura = new JTextField(15);
        campoAltura.addActionListener(this);
        grupoPesoAltura.add(labelAltura);
        grupoPesoAltura.add(campoAltura);
        labelPeso = new JLabel("Peso (Kg): ");
        campoPeso = new JTextField(15);
        campoPeso.addActionListener(this);
        grupoPesoAltura.add(labelPeso);
        grupoPesoAltura.add(campoPeso);
        grupoTexto.add(grupoPesoAltura);
        //grupo sexo e botão cadastrar
        grupoSexo = new JPanel();
        labelSexo = new JLabel("Sexo: ");
        botaoDeSelecao = new JComboBox(botaoDeSelecaoString);
        botaoDeSelecao.addActionListener(this);
        cadastrar = new JButton("Cadastrar");
        cadastrar.addActionListener(this);
        grupoSexo.add(labelSexo);
        grupoSexo.add(botaoDeSelecao);
        grupoSexo.add(cadastrar);
        grupoTexto.add(grupoSexo);
        //Content Pane
        cp = getContentPane();
        p = new Panel();
        JScrollPane scrollPane = new JScrollPane(dadosIMC,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(490, 183));
        grupoGrid = new JPanel();
        grupoGrid.setLayout(new BoxLayout(grupoGrid, BoxLayout.Y_AXIS));
        grupoGrid.add(grupoBotaoSort);
        grupoGrid.add(scrollPane);
        grupoGrid.setPreferredSize(new Dimension(500, 283));
        TitledBorder titleG = BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "Tabela");
        titleG.setTitlePosition(TitledBorder.ABOVE_TOP);
        grupoGrid.setBorder(titleG);
        grupoTexto.setPreferredSize(new Dimension(500, 200));
        TitledBorder titleC = BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "Cadastro");
        titleC.setTitlePosition(TitledBorder.ABOVE_TOP);
        grupoTexto.setBorder(titleC);
        p.setLayout(new BorderLayout());
        p.add(grupoTexto,BorderLayout.NORTH);
        p.add(grupoGrid,BorderLayout.SOUTH);
        TitledBorder title = BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Calculadora IMC");
        title.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title);
        cp.add(p);
        iniciaTabela();

    }

    public void resetaTabela() {
        model.setRowCount(0);
    }

    public static String converteNome(String text) {
      if (text == null || text.isEmpty()) {
          return text;
      }
  
      StringBuilder converted = new StringBuilder();
  
      boolean convertNext = true;
      for (char ch : text.toCharArray()) {
          if (Character.isSpaceChar(ch)) {
              convertNext = true;
          } else if (convertNext) {
              ch = Character.toTitleCase(ch);
              convertNext = false;
          } else {
              ch = Character.toLowerCase(ch);
          }
          converted.append(ch);
      }
  
      return converted.toString();
  }

    public boolean verificaCampos() {
        if (campoNome.getText().isEmpty()) {
            aviso("Campo Nome deve ser preenchido. ", "Nao preenchido");
            return false;
        } else if (campoData.getText().isEmpty()) {
            aviso("Campo Data deve ser preenchido. ", "Nao preenchido");
            return false;
        } else if (campoAltura.getText().isEmpty()) {
            aviso("Campo Altura deve ser preenchido. ", "Nao preenchido");
            return false;
        } else if (campoPeso.getText().isEmpty()) {
            aviso("Campo Peso deve ser preenchido. ", "Nao preenchido");
            return false;
        } else if (botaoDeSelecao.getSelectedItem() == "Selecione") {
            aviso("Algum Sexo deve ser selecionado.", "Nao preenchido");
            return false;
        }
        try{
           formatDate.parse(campoData.getText());
        }catch(Exception e){
            informacao("Data deve ser do formato dd/mm/aaaa", "Formato incorreto");
            return false;
        }
        try {
            double tamanho = Double.parseDouble(campoAltura.getText());
            if(tamanho<0.5 || tamanho>2.5){
                informacao("Altura deve ser um valor entre 0.5 metro e 2.5 metros.", "Fora da faixa de dados");
                return false;
            }
        } catch (NumberFormatException e) {
            erro("Altura deve ser um numero.", "Erro de transformacao");
            return false;
        }
        try {
            double peso = Double.parseDouble(campoPeso.getText());
            if(peso<2.5 || peso>300.0){
                informacao("Peso deve ser um valor entre 2.5 quilos e 300 quilos.", "Fora da faixa de dados");
                return false;
            }
        } catch (NumberFormatException e) {
            erro("Peso deve ser um numero.", "Erro de transformacao");
            return false;
        }
        return true;
    }

    public void cadastrar() {
        if (verificaCampos()) {
            if (botaoDeSelecao.getSelectedItem() == "Masculino") {
                lista.add(new Homem(converteNome(campoNome.getText()), campoData.getText(), Double.parseDouble(campoPeso.getText()), Double.parseDouble(campoAltura.getText())));
            } else if (botaoDeSelecao.getSelectedItem() == "Feminino") {
                lista.add(new Mulher(converteNome(campoNome.getText()), campoData.getText(), Double.parseDouble(campoPeso.getText()), Double.parseDouble(campoAltura.getText())));
            }
            iniciaTabela();
            limpaCampos();
        }
    }

    public static void aviso(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.WARNING_MESSAGE);
    }

    public static void erro(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.ERROR_MESSAGE);
    }

    public static void informacao(String infoMessage, String titleBar) {
      JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
  }

    public void iniciaTabela() {
        resetaTabela();
        for (int i = 0; i < lista.getTamanho(); i++) {
            model.addRow(new Object[]{lista.get(i).getNome(), lista.get(i).getData(), lista.get(i).getAltura(), lista.get(i).getPeso(), lista.get(i).getSexo(), lista.get(i).getIMC(), lista.get(i).resultIMC()});
        }
    }

    public void limpaCampos() {
        campoNome.setText("");
        campoData.setText("");
        campoPeso.setText("");
        campoAltura.setText("");
        botaoDeSelecao.setSelectedItem("Selecione");
    }
    //Este metodo responde as acoes dos componentes

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == nome) {
            if (nomeR == 0) {
                lista.ordena(1);
                nomeR = 1;
            } else {
                lista.ordena(2);
                nomeR = 0;
            }
            iniciaTabela();
        }
        if (e.getSource() == peso) {
            if (pesoR == 0) {
                lista.ordena(3);
                pesoR = 1;
            } else {
                lista.ordena(4);
                pesoR = 0;
            }
            iniciaTabela();
        }
        if (e.getSource() == altura) {
            if (alturaR == 0) {
                lista.ordena(5);
                alturaR = 1;
            } else {
                lista.ordena(6);
                alturaR = 0;
            }
            iniciaTabela();
        }
        if (e.getSource() == imc) {
            if (imcR == 0) {
                lista.ordena(7);
                imcR = 1;
            } else {
                lista.ordena(8);
                imcR = 0;
            }
            iniciaTabela();
        }
        if (e.getSource() == sexo) {
            if (sexoR == 0) {
                lista.ordena(9);
                sexoR = 1;
            } else {
                lista.ordena(10);
                sexoR = 0;
            }
            iniciaTabela();
        }
        if(e.getSource() == data){
           if(dataR==0){
              lista.ordena(11);
               dataR=1;
           }
           else{
            lista.ordena(12);
            dataR=0;
           }
         iniciaTabela();
        }
        if (e.getSource() == cadastrar) {
            cadastrar();
        }
    }

    class Panel extends JPanel {

        public void paintComponent(java.awt.Graphics g) {
            super.paintComponent(g);
        }
    }
}
