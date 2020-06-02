//
//  ContentView.swift
//  iOSApp
//
//  Created by Marco Estrella on 2/6/20.
//  Copyright © 2020 Marco Estrella. All rights reserved.
//

import SwiftUI
import common

struct ContentView: View {
    var body: some View {
        Text(HelloWorldCommonKt.helloWorld())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
