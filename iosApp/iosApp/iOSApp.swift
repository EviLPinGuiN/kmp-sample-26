import SwiftUI
import CommonKmp

@main
struct iOSApp: App {


    init() {
        initKoin()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }

    private func initKoin() {
        var isDebug = false
        #if DEBUG
        isDebug = true
        #endif

        CommonKmp.shared.doInitKoin(
            configuration: Configuration(
                isHttpLoggingEnabled: isDebug,
                isDebug: isDebug
            ),
            appDeclaration: {_ in },
        )
    }
}
