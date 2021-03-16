package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThreatIntel
 */
public class ThreatIntel  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source")
    
    private String source;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private OffsetDateTime updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_url")
    
    private String sourceUrl;

    public ThreatIntel withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 威胁情报类型，Domain、Email_Address、Hash_MD5、Hash_SHA1、Hash_SHA256、 Hash_SHA512、IPv4_Address、IPv6_Address、URL。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ThreatIntel withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 威胁情报指标值，最大512个字符。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    public ThreatIntel withSource(String source) {
        this.source = source;
        return this;
    }

    


    /**
     * 威胁情报源，最大64个字符。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    

    public ThreatIntel withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 威胁情报描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ThreatIntel withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 威胁情报的更新时间，格式ISO8601：YYYY-MM-DDTHH:mm:ss.ms+timezone。时区信息为事件发生时区，无法解析时区的时间，默认时区填东八区。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    

    public ThreatIntel withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    


    /**
     * 链接，提供有关威胁情报源的更多详细信息。
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThreatIntel threatIntel = (ThreatIntel) o;
        return Objects.equals(this.type, threatIntel.type) &&
            Objects.equals(this.value, threatIntel.value) &&
            Objects.equals(this.source, threatIntel.source) &&
            Objects.equals(this.description, threatIntel.description) &&
            Objects.equals(this.updateTime, threatIntel.updateTime) &&
            Objects.equals(this.sourceUrl, threatIntel.sourceUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, value, source, description, updateTime, sourceUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreatIntel {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
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

