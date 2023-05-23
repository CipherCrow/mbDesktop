package view.gui;

import java.awt.Font;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ExceptionHandler {
    
    public static void exibirExcecaoDialog(Throwable excecao) {
        // Obter o tipo da exceção
        String tipoExcecao = excecao.getClass().getSimpleName();

        // Obter a mensagem da exceção
        String mensagemExcecao = excecao.getMessage();

        // Obter o stack trace da exceção
        StringWriter stackTraceWriter = new StringWriter();
        excecao.printStackTrace(new PrintWriter(stackTraceWriter));
          String stackTrace = "Um erro ocorreu e fez a aplicação não agir como deveria!\nPoderia fazer a gentileza de contatar o desenvolvedor? O código abaixo é copiavel, lembre-se de envia-lo"
                + " junto à mensagem para que o desenvolvedor possa encontrar a solução para o problema! \n\n";

        System.out.println(stackTrace);
        // Criar a caixa de texto para o stack trace
        JTextArea stackTraceTextArea = new JTextArea(stackTrace);
        stackTraceTextArea.append( stackTraceWriter.toString() );
        stackTraceTextArea.setEditable(false);
        stackTraceTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        stackTraceTextArea.setLineWrap(true);
        stackTraceTextArea.setWrapStyleWord(true);

        // Criar o painel de rolagem para a caixa de texto
        JScrollPane scrollPane = new JScrollPane(stackTraceTextArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(850, 300));

        // Exibir o diálogo de exceção
        JOptionPane.showMessageDialog(null, scrollPane, tipoExcecao, JOptionPane.ERROR_MESSAGE);
    }
       
}
