package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowKeyRotationStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_rotation_enabled")
    
    private Boolean keyRotationEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rotation_interval")
    
    private Integer rotationInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_rotation_time")
    
    private String lastRotationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number_of_rotations")
    
    private Integer numberOfRotations;

    public ShowKeyRotationStatusResponse withKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
        return this;
    }

    


    /**
     * 密钥轮换状态，默认为“false”，表示关闭密钥轮换功能。
     * @return keyRotationEnabled
     */
    public Boolean getKeyRotationEnabled() {
        return keyRotationEnabled;
    }

    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    public ShowKeyRotationStatusResponse withRotationInterval(Integer rotationInterval) {
        this.rotationInterval = rotationInterval;
        return this;
    }

    


    /**
     * 轮换周期，取值范围为30~365的整数。 周期范围设置根据密钥使用频率进行，若密钥使用频率高，建议设置为短周期；反之，则设置为长周期。
     * minimum: 30
     * maximum: 365
     * @return rotationInterval
     */
    public Integer getRotationInterval() {
        return rotationInterval;
    }

    public void setRotationInterval(Integer rotationInterval) {
        this.rotationInterval = rotationInterval;
    }

    public ShowKeyRotationStatusResponse withLastRotationTime(String lastRotationTime) {
        this.lastRotationTime = lastRotationTime;
        return this;
    }

    


    /**
     * 上一次密钥轮换时间。时间戳，即从1970年1月1日至该时间的总秒数。
     * @return lastRotationTime
     */
    public String getLastRotationTime() {
        return lastRotationTime;
    }

    public void setLastRotationTime(String lastRotationTime) {
        this.lastRotationTime = lastRotationTime;
    }

    public ShowKeyRotationStatusResponse withNumberOfRotations(Integer numberOfRotations) {
        this.numberOfRotations = numberOfRotations;
        return this;
    }

    


    /**
     * 密钥轮换次数。
     * minimum: 0
     * maximum: 1000
     * @return numberOfRotations
     */
    public Integer getNumberOfRotations() {
        return numberOfRotations;
    }

    public void setNumberOfRotations(Integer numberOfRotations) {
        this.numberOfRotations = numberOfRotations;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowKeyRotationStatusResponse showKeyRotationStatusResponse = (ShowKeyRotationStatusResponse) o;
        return Objects.equals(this.keyRotationEnabled, showKeyRotationStatusResponse.keyRotationEnabled) &&
            Objects.equals(this.rotationInterval, showKeyRotationStatusResponse.rotationInterval) &&
            Objects.equals(this.lastRotationTime, showKeyRotationStatusResponse.lastRotationTime) &&
            Objects.equals(this.numberOfRotations, showKeyRotationStatusResponse.numberOfRotations);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyRotationEnabled, rotationInterval, lastRotationTime, numberOfRotations);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeyRotationStatusResponse {\n");
        sb.append("    keyRotationEnabled: ").append(toIndentedString(keyRotationEnabled)).append("\n");
        sb.append("    rotationInterval: ").append(toIndentedString(rotationInterval)).append("\n");
        sb.append("    lastRotationTime: ").append(toIndentedString(lastRotationTime)).append("\n");
        sb.append("    numberOfRotations: ").append(toIndentedString(numberOfRotations)).append("\n");
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

