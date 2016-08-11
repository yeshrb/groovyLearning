import javax.swing.*
import java.awt.*
import java.awt.event.*

frame = new JFrame(size:[300,300],
    layout:new FlowLayout(),
    defaultCloseOperation:javax.swing.WindowConstants.EXIT_ON_CLOSE)
button = new JButton("click")
positionLabel = new JLabel("")
msgLabel = new JLabel("")
frame.contentPane.add button
frame.contentPane.add positionLabel
frame.contentPane.add msgLabel

button.addActionListener(
    {JOptionPane.showMessageDialog(frame,"you clicked!")} as ActionListener
)

displayMouseLocation = {positionLabel.setText("$it.x,$it.y")}
frame.addMouseListener(displayMouseLocation as MouseListener)
frame.addMouseMotionListener(displayMouseLocation as MouseMotionListener)

events = ['WindowListener','ComponentListener']
handler= {msgLabel.setText("$it")}

for(event in events) {
    handlerImpl = handler.asType(Class.forName("java.awt.event.${event}"))
    frame."add${event}" (handlerImpl)
}

frame.show()