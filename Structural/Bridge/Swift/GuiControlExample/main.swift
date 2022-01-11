import Foundation

// client
var btn:IControl = Button(name: "btnTest")

btn.ControlImplementor = IosButton()
btn.Render()

btn.ControlImplementor = AndroidButton()
btn.Render()

var txt:IControl = TextBox(name: "txtTest")

txt.ControlImplementor = IosTextBox()
txt.Render()

txt.ControlImplementor = AndroidTextBox()
txt.Render()