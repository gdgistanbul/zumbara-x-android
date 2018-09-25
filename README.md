# Zumbara X Android
Project-X Android

# What the project does - Zumbara Nedir?
Zumbara temel olarak bir zaman bankası uygulaması. Topluluk üyeleri para yerine zaman harcıyorlar ve verdikleri hizmet karşılığında da zaman kazanıyorlar. Merak edenleri [manifestolarını](http://www.zumbara.com/manifesto) incelemeye davet ediyoruz.

# Why the project is useful
Zumbara insanların paranın olmadığı bir ekonomi de birbilerinden servis olarak gelişme ve geliştirmelerine imkan sağlamaktadır.

# How users can get started with the project
- Branching:
Zumbara Projesi yaşam döngüsü boyunca iki ana branch’ den meydana gelecektir. Bu iki branch sırasıyla master ve develop olarak isimlendirilir.
Geliştirmeler için feature branch oluşturulacak olup, Pull-Request sistemi ile geliştirilen kodların belirli bir standart üzerinde devam etmesi sağlanacaktır.
![alt](https://cdn-images-1.medium.com/max/2000/1*0R47tINjG8cJ68LNCkj4MA.jpeg)
- Mimari:
Projenin mimarisini genel hatlarıyla anlatacak olursak, uygulama her birinin kendi sorumlulukları olan ayrı katmanlardan meydana gelmektedir. Projenin genel olarak mimarisi kurgulanırken takip ettiğimiz kaynak ise Google tarafından temel anlamda referans olarak paylaşılan aşağıda bulunan yazıdır.
<Enter>
[Reference](https://developer.android.com/jetpack/docs/guide)
    - UI
    Bu katman içersinde bulunacak olan sınıflar Activity, Fragment, Adapter gibi arayüz ile doğrudan ilişkili sınıflar olacaktır. Bu sınıflar içerisinde herhangi bir business ile alakalı mantık içeren kod bulundurmayacak ve sadece presentation katmanınından observe edilen data ’yı arayüzde göstermekle sorumlu olacaktır. ![](https://cdn-images-1.medium.com/max/1600/1*K8kJ-9EVxH3wEAwmpqzO1Q.png)
    - Presentation
    Bu katman içerisinde bulunacak olan sınıflar UI ve Data katmanları arasında meydana gelen bağlantılı işlemlerin gerçekleşmesi sağlayacaktır. Bu katman içinde yer alan yapıyı inşa etmek için Android Architecture Components kütüphanelerinden destek alınmaktadır. LiveData, ViewModel gibi yapılar ile uygulamanın reactive bir şekilde çalışmasına ve Android lifecycle sistemine bağlı kalarak hayatına devam etmesine destek sağlanması amaçlanmaktadır.
    ![](https://cdn-images-1.medium.com/max/1600/1*FIf9r0F5jakjVuA0guEe8w.png)
    - Repository
    Bu katman içerisinde bulunacak olan sınıflar uygulamanın network isteklerinin oluşturulduğu veya **local cache/database** vb. depolama işlemlerine ait kodların yazıldığı yapılardan meydana gelmektedir.
    - DataSource
    Kendi içerisinde remote kaynak üzerinden beslenen **RemoteDataSource **olarak isimlendirdiğimiz yapılar ve local kaynak üzerinden beslenen LocalDataSource olarak isimlendirdiğimiz yapılar bulunmaktadır.


![](https://cdn-images-1.medium.com/max/1600/1*SK6HDunzerbX9Jfa3mvOZQ.jpeg)

# Where users can get help with your project
Bir problem veya features seçip gelistirebilirler.

# Who maintains and contributes to the project
- GDG / WTM Istanbul
    - Murat Can Bur [github](https://github.com/muratcanbur)
    - Elif Boncuk [github](https://github.com/elifbon)
    - Erol Kaftanoglu [github](https://github.com/erolkaftanoglu)
    - Selehattin Köle [github](https://github.com/selahattinkole)
