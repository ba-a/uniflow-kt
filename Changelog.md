
# Uniflow 🦄- Simple Unidirectionnel Data Flow for Android & Kotlin, using Kotlin coroutines and open to functional programming

#### ⚒ Team - (Arnaud Giuliani, Marcin Chrapowicz, Erik Huizinga)

## Changelog

## 0.11.x

### 0.11.0

- `update` Kotlin 1.3.72 & Kotlin Coroutines 1.3.5
- `update` Arrow integration with Either type in `uniflow-arrow` module. Arrow update to 0.10.5 (👍 Borja Quevedo)
- `update` internal components design: Keep DataFlow as interface and use components: ActionDispatcher, ActionReducer, UiDataPublisher & UiDataStore. Help to avoid expose internal functions API
- `added` better testing tools and introduce `createTestObserver` to help create `TestViewObserver`. It allow to use `assertReceived` data states & events
- `fixed` Endless loop fix - (👍 Grzegorz Gajewski)
- `added`  Add UniFlowLogger.default() to reset to the default Logger 
- `fixed`  Use TestCoroutineDispatcher instead of Dispatchers.Unconfined

### 0.10.3

- `added` better test tools to compare list of states/events directly

### 0.10.2

- `fixed` DataFlow is now adding new action with `send` on Actor, anwith a coroutine call on IO

### 0.10.1

- `update` AndroidDataFlow() use `UIState.Empty` as default state 

### 0.10.0

_no backward compatibility API with previous version!_

- `update` Rework all internals app design components, an action is now a Kotlin Flow emitting UISTate/UIEvent
- `update` Non nullable default state
- `add` Unify actions API to return `ActionFlow` and use `setState` and not having 2 kinds of action flow
- `update` `setState { }` / `fromState<> { }` API are now `action { }` and `actionOn<> { }`. You need to use `setState` to specify a state.
- `update` `stateFlow { }` / `stateFlowFrom<> { }` API are now `action { }` and `actionOn<> { }`

### 0.8.x

#### 0.8.5

- merge `AndroidDataFlow` and `AndroidActorFlow` classes in both Android libs to provide an actor based ViewModel by default, to ensure event scheduling ordered.


