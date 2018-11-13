package money.pro.app.domain.common

import io.reactivex.ObservableTransformer

// run thread to avoid run on the Main thread
abstract class Transformer<T> : ObservableTransformer<T, T>