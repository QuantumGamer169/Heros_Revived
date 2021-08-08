
package heros_revived.itemgroup;

@HerosRevivedElements.ModElement.Tag
public class HerosrevivedItemGroup extends HerosRevivedElements.ModElement {

	public HerosrevivedItemGroup(HerosRevivedElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabherosrevived") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.BLAZE_POWDER, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
