package gov.loc.repository.bagit.v0_93;

import static org.junit.Assert.assertEquals;

import gov.loc.repository.bagit.Bag;
import gov.loc.repository.bagit.BagFactory.Version;
import gov.loc.repository.bagit.BagInfoTxt;
import gov.loc.repository.bagit.impl.AbstractBagImplTest;

public class BagImplTest extends AbstractBagImplTest {

	@Override
	public Version getVersion() {
		return Version.V0_93;
	}

	@Override
	public void performAddlTestCreateBag(Bag bag) {
		BagInfoTxt bagInfo = bag.getBagInfoTxt();
		assertEquals(bagInfo.getBagSize(), bagInfo.get(gov.loc.repository.bagit.v0_93.impl.Version0_93BagInfoTxtImpl.FIELD_PACKAGE_SIZE));
		assertEquals(bagInfo.getBaggingDate(), bagInfo.get(gov.loc.repository.bagit.v0_93.impl.Version0_93BagInfoTxtImpl.FIELD_PACKING_DATE));

	}
	
	@Override
	public void performTestBagWithTagDirectory(Bag bag) {
		performTestBagWithTagDirectoryPrev97(bag);		
	}
	
	@Override
	public void performTestBagWithIgnoredTagDirectory(Bag bag) {
		performTestBagWithIgnoredTagDirectoryPrev97(bag);		
	}
	
	@Override
  public String getValidZipBag() {
    return "bags/v0_93/bag.zip";
  }
	
	@Override
  public String getInvalidZipBag() {
    return "bags/v0_93/invalidBag.zip";
  }

  @Override
  public String getValidBagFolder() {
    return "bags/v0_93/bag";
  }

  @Override
  public String getInvalidBagFolder() {
    return "bags/v0_93/invalidBag";
  }
}