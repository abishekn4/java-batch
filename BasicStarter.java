class BasicStarter{

	public static void main(String[] args) {
		
		EarPhone earPhone = new EarPhone(1300, 330, "blue");
		System.out.println(EarPhone.brand);
		System.out.println(earPhone.price);
		System.out.println(earPhone.model);
		System.out.println(earPhone.color);

		EarPhone earPhone1 = new EarPhone(1800, 335, "green");
		System.out.println(EarPhone.brand);
		System.out.println(earPhone1.price);
		System.out.println(earPhone1.model);
		System.out.println(earPhone1.color);

		Book book = new Book("A Bunch of Old Letters", "Biography");
		System.out.println(book.name);
		System.out.println(book.type);
		System.out.println(book.author);
		System.out.println(book.lang);
		System.out.println(Book.publisher);

		Book book1 = new Book("An AutoBiography", "Biography");
		System.out.println(book1.name);
		System.out.println(book1.type);
		System.out.println(book1.author);
		System.out.println(book1.lang);
		System.out.println(Book.publisher);


		MusicInstrument musicInstrument = new MusicInstrument("yamaha", true, "black", "keyboard", "Y5567", 5.5f, 14000, 5);

		System.out.println("1st instance");

		System.out.println(musicInstrument.madeIn);
		System.out.println(musicInstrument.usedFor);
		System.out.println(MusicInstrument.brand);
		System.out.println(MusicInstrument.portable);
		System.out.println(musicInstrument.color);
		System.out.println(musicInstrument.name);
		System.out.println(musicInstrument.model);
		System.out.println(musicInstrument.size);
		System.out.println(musicInstrument.price);
		System.out.println(musicInstrument.warranty);


		MusicInstrument musicInstrument1 = new MusicInstrument("Philips", true, "black");

		System.out.println("2 nd instance");

		System.out.println(musicInstrument1.madeIn);
		System.out.println(musicInstrument1.usedFor);
		System.out.println(MusicInstrument.brand);
		System.out.println(MusicInstrument.portable);
		System.out.println(musicInstrument1.color);

		MusicInstrument musicInstrument2 = new MusicInstrument("Yamaha",true, "brown","Guitar" );

		System.out.println("3 rd instance");

		System.out.println(musicInstrument2.madeIn);
		System.out.println(musicInstrument2.usedFor);
		System.out.println(MusicInstrument.brand);
		System.out.println(MusicInstrument.portable);
		System.out.println(musicInstrument2.color);
		System.out.println(musicInstrument2.name);


		MusicInstrument musicInstrument3 = new MusicInstrument("Casio", false, "black", "Piano", "c436", 20);

		System.out.println("4 th instance");

		System.out.println(musicInstrument3.madeIn);
		System.out.println(musicInstrument3.usedFor);
		System.out.println(MusicInstrument.brand);
		System.out.println(MusicInstrument.portable);
		System.out.println(musicInstrument3.color);
		System.out.println(musicInstrument3.name);
		System.out.println(musicInstrument3.model);
		System.out.println(musicInstrument3.size);

		
		MusicInstrument musicInstrument4 = new MusicInstrument("Yamaha", 7, "Y432", "Guitar", 16000, 3 );

		System.out.println("5 th instance");

		System.out.println(MusicInstrument.brand);
		System.out.println(musicInstrument4.size);
		System.out.println(musicInstrument4.model);
		System.out.println(musicInstrument4.name);
		System.out.println(musicInstrument4.price);
		System.out.println(musicInstrument4.warranty);
		System.out.println(musicInstrument4.madeIn);
		System.out.println(musicInstrument4.usedFor);









		





	}
}