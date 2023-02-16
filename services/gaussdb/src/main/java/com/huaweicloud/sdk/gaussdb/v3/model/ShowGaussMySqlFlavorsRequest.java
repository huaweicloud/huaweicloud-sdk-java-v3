package com.huaweicloud.sdk.gaussdb.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowGaussMySqlFlavorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="database_name")
    
    
    private String databaseName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version_name")
    
    
    private String versionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone_mode")
    
    
    private String availabilityZoneMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    
    private String specCode;

    public ShowGaussMySqlFlavorsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * 语言。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ShowGaussMySqlFlavorsRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    


    /**
     * 数据库引擎名称。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    

    public ShowGaussMySqlFlavorsRequest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    


    /**
     * 数据库版本号，目前仅支持兼容MySQL 8.0。
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    

    public ShowGaussMySqlFlavorsRequest withAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
        return this;
    }

    


    /**
     * 规格的可用区模式，现在仅支持\"single\"、\"multi\"，不区分大小写。
     * @return availabilityZoneMode
     */
    public String getAvailabilityZoneMode() {
        return availabilityZoneMode;
    }

    public void setAvailabilityZoneMode(String availabilityZoneMode) {
        this.availabilityZoneMode = availabilityZoneMode;
    }

    

    public ShowGaussMySqlFlavorsRequest withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGaussMySqlFlavorsRequest showGaussMySqlFlavorsRequest = (ShowGaussMySqlFlavorsRequest) o;
        return Objects.equals(this.xLanguage, showGaussMySqlFlavorsRequest.xLanguage) &&
            Objects.equals(this.databaseName, showGaussMySqlFlavorsRequest.databaseName) &&
            Objects.equals(this.versionName, showGaussMySqlFlavorsRequest.versionName) &&
            Objects.equals(this.availabilityZoneMode, showGaussMySqlFlavorsRequest.availabilityZoneMode) &&
            Objects.equals(this.specCode, showGaussMySqlFlavorsRequest.specCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, databaseName, versionName, availabilityZoneMode, specCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGaussMySqlFlavorsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    availabilityZoneMode: ").append(toIndentedString(availabilityZoneMode)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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

