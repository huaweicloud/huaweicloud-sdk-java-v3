package com.huaweicloud.sdk.live.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.QualityInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AppQualityInfo
 */
public class AppQualityInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quality_info")
    
    private List<QualityInfo> qualityInfo = null;
    
    public AppQualityInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppQualityInfo withQualityInfo(List<QualityInfo> qualityInfo) {
        this.qualityInfo = qualityInfo;
        return this;
    }

    
    public AppQualityInfo addQualityInfoItem(QualityInfo qualityInfoItem) {
        if (this.qualityInfo == null) {
            this.qualityInfo = new ArrayList<>();
        }
        this.qualityInfo.add(qualityInfoItem);
        return this;
    }

    public AppQualityInfo withQualityInfo(Consumer<List<QualityInfo>> qualityInfoSetter) {
        if(this.qualityInfo == null ){
            this.qualityInfo = new ArrayList<>();
        }
        qualityInfoSetter.accept(this.qualityInfo);
        return this;
    }

    /**
     * 视频质量信息
     * @return qualityInfo
     */
    public List<QualityInfo> getQualityInfo() {
        return qualityInfo;
    }

    public void setQualityInfo(List<QualityInfo> qualityInfo) {
        this.qualityInfo = qualityInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppQualityInfo appQualityInfo = (AppQualityInfo) o;
        return Objects.equals(this.appName, appQualityInfo.appName) &&
            Objects.equals(this.qualityInfo, appQualityInfo.qualityInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appName, qualityInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppQualityInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    qualityInfo: ").append(toIndentedString(qualityInfo)).append("\n");
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

