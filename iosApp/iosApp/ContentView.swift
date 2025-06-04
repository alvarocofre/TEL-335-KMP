import SwiftUI
import Shared

struct ContentView: View {
    @State private var showContent = false
    var body: some View {
        let sampleQuestion = QuestionDto(
            id: 1, text: "Cual es la capital de Chile?", category: "Geografía"
        )
        VStack {
            Text(sampleQuestion.text)
                .font(.title)
            Text(sampleQuestion.category)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
