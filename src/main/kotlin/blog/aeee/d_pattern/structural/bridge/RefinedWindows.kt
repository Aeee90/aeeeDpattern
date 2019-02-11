package blog.aeee.d_pattern.structural.bridge

class ApplicationWindow: Window(View()) {
    //Window클래스를 상속하여 다른 종류의 윈도우를 정의하도록 한다.
}

class IconWindow: Window(View()){
    //Window클래스를 상속하여 다른 종류의 윈도우를 정의하도록 한다.
}