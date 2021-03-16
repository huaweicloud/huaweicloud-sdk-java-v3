package com.huaweicloud.sdk.kms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GenRandomRequestBody
 */
public class GenRandomRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="random_data_length")
    
    private String randomDataLength;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sequence")
    
    private String sequence;

    public GenRandomRequestBody withRandomDataLength(String randomDataLength) {
        this.randomDataLength = randomDataLength;
        return this;
    }

    


    /**
     * 随机数的bit位长度。 取值为8的倍数，取值范围为8~8192。 随机数的bit位长度，取值为“512”。
     * @return randomDataLength
     */
    public String getRandomDataLength() {
        return randomDataLength;
    }

    public void setRandomDataLength(String randomDataLength) {
        this.randomDataLength = randomDataLength;
    }

    

    public GenRandomRequestBody withSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }

    


    /**
     * 请求消息序列号，36字节序列号。 例如：919c82d4-8046-4722-9094-35c3c6524cff
     * @return sequence
     */
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenRandomRequestBody genRandomRequestBody = (GenRandomRequestBody) o;
        return Objects.equals(this.randomDataLength, genRandomRequestBody.randomDataLength) &&
            Objects.equals(this.sequence, genRandomRequestBody.sequence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(randomDataLength, sequence);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenRandomRequestBody {\n");
        sb.append("    randomDataLength: ").append(toIndentedString(randomDataLength)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

