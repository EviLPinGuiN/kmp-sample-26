//
//  WeatherViewModel.swift
//  iosApp
//
//  Created by Nail Shaykhraziev on 13.04.2026.
//

import CommonKmp
import Combine

final class IosWeatherViewModel : ObservableObject {

    private let commonViewModel: WeatherViewModel

    @Published
    private(set) var state: WeatherViewState

    init(_ commonViewModel: WeatherViewModel) {
        self.commonViewModel = commonViewModel

        self.state = commonViewModel.viewStates.value
        (self.commonViewModel.viewStates.asPublisher() as AnyPublisher<WeatherViewState, Never>)
            .receive(on: RunLoop.main)
            .assign(to: &$state)
    }

    func obtainEvent(_ event : WeatherEvent) {
        self.commonViewModel.obtainEvent(event: event)
    }

    deinit {
        commonViewModel.onCleared()
    }

}
