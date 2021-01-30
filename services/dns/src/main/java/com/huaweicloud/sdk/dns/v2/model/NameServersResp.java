package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.NsRecords;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NameServersResp
 */
public class NameServersResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ns_records")
    
    private List<NsRecords> nsRecords = null;
    
    public NameServersResp withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 待查询名称服务器的类型。  取值范围: public, private。  如果为空，表示查询所有类型的名称服务器。 如果为public，表示查询公网的名称服务器。  如果为private，表示查询内网的名称服务器。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NameServersResp withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 待查询的region ID。  当查询公网的名称服务器时，此处不填。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public NameServersResp withNsRecords(List<NsRecords> nsRecords) {
        this.nsRecords = nsRecords;
        return this;
    }

    
    public NameServersResp addNsRecordsItem(NsRecords nsRecordsItem) {
        if (this.nsRecords == null) {
            this.nsRecords = new ArrayList<>();
        }
        this.nsRecords.add(nsRecordsItem);
        return this;
    }

    public NameServersResp withNsRecords(Consumer<List<NsRecords>> nsRecordsSetter) {
        if(this.nsRecords == null ){
            this.nsRecords = new ArrayList<>();
        }
        nsRecordsSetter.accept(this.nsRecords);
        return this;
    }

    /**
     * Get nsRecords
     * @return nsRecords
     */
    public List<NsRecords> getNsRecords() {
        return nsRecords;
    }

    public void setNsRecords(List<NsRecords> nsRecords) {
        this.nsRecords = nsRecords;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NameServersResp nameServersResp = (NameServersResp) o;
        return Objects.equals(this.type, nameServersResp.type) &&
            Objects.equals(this.region, nameServersResp.region) &&
            Objects.equals(this.nsRecords, nameServersResp.nsRecords);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, region, nsRecords);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NameServersResp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    nsRecords: ").append(toIndentedString(nsRecords)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

