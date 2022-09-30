class ChargerTester{
	public static void main(String[] args) {


		NewCharger charger= new NewCharger(ChargerColor.BLACK, ChargerType.WIRED, 65, "MI", ChargerPin.TYPE_C, true, 3, true);

		charger.about();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		charger.updateColor();
		charger.updateType();
		charger.updateWatts();
		charger.updateBrand();
		charger.updatePinType();
		charger.updateUsb();
		charger.updateLength();
		charger.updateWorking();

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		charger.updateColor(ChargerColor.RED);
		charger.updateType(ChargerType.WIRELESS);
		charger.updateWatts(35);
		charger.updateBrand("One Plus");
		charger.updatePinType(ChargerPin.TYPE_C);
		charger.updateUsb(true);
		charger.updateLength(5);
		charger.updateWorking(true);

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		charger.updateAll(ChargerColor.WHITE, ChargerType.WIRELESS, 33, "Apple", ChargerPin.LIGHTNING, true, 3, true);
		charger.about();


	}

}