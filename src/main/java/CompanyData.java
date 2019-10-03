import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class CompanyData {
    public String fullName;
    public String shortName;
    public String inn;
    public String kpp;
    public String ogrn;
    public String managementPost;
    public String managementName;
    public String managementBasis;
    public String postalCodeword;
    public String region;
    public String city;
    public String street;
    public String house;
    public String postalCodeMailingAddress;
    public String regionMailingAddress;
    public String cityMailingAddress;
    public String streetMailingAddress;
    public String houseInputMailingAddress;

    JSONParser parser = new JSONParser();

    CompanyData() {
        try {
            Object obj = parser.parse(new FileReader(
                    "C:\\Users\\Melkish\\IdeaProjects\\Test_kabinet\\data-files\\DataCompany"));
            JSONObject jsonObject = (JSONObject) obj;
            fullName = (String) jsonObject.get("FullName");
            shortName = (String) jsonObject.get("ShortName");
            inn = (String) jsonObject.get("Inn");
            kpp = (String) jsonObject.get("Kpp");
            ogrn = (String) jsonObject.get("Ogrn");
            managementPost = (String) jsonObject.get("ManagementPost");
            managementName = (String) jsonObject.get("ManagementName");
            managementBasis = (String) jsonObject.get("ManagementBasis");
            postalCodeword = (String) jsonObject.get("PostalCodeword");
            region = (String) jsonObject.get("Region");
            city = (String) jsonObject.get("City");
            street = (String) jsonObject.get("Street");
            house = (String) jsonObject.get("House");
            postalCodeMailingAddress = (String) jsonObject.get("PostalCodeMailingAddress");
            regionMailingAddress = (String) jsonObject.get("RegionMailingAddress");
            cityMailingAddress = (String) jsonObject.get("CityMailingAddress");
            streetMailingAddress = (String) jsonObject.get("StreetMailingAddress");
            houseInputMailingAddress = (String) jsonObject.get("HouseInputMailingAddress");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
