package Scr;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

public class QuestionPageScreen{
    
    private JPanel ScrGrade;
    JPanel QPanel = new JPanel();
    JPanel ScrScreen = new JPanel();
    JButton submit = new JButton();

    
    //submit.addActionListener(new SubmitBListener());






    private class SubmitBListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                //////

            }
            catch(){
                
            }
        }
    }

    private class questionDisplay{
        for(String question: questionList){
            JPanel questionPanel = new JPanel(new BorderLayout());
            questionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // Add question text
            JLabel questionLabel = new JLabel(question);
            questionPanel.add(questionLabel, BorderLayout.NORTH);

            // Add answer choices
            ButtonGroup buttonGroup = new ButtonGroup();
            for (String answer : questions.get(question)) {
                JRadioButton radioButton = new JRadioButton(answer);
                buttonGroup.add(radioButton);
                questionPanel.add(radioButton);
            }

            QPanel.add(questionPanel);
        }
    }

    private class showScore{

    }

}
