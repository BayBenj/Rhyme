package tables;

public class MonoPlaceTable extends PlaceTable {

	@Override
	public int get_i_size() {
		return getSize();
	}

	@Override
	public int get_j_size() {
		return getSize();
	}

}
