package com.huaweicloud.sdk.nlp.v2.model;




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
public class RunLanguageDetectionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detected_language")
    
    
    private String detectedLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunLanguageDetectionResponse withDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
        return this;
    }

    


    /**
     * 调用成功时表示调用结果，语种缩写对应名称如下： 阿拉伯语 ar 爱沙尼亚语 et 保加利亚语 bg 冰岛语 is 波兰语 pl 波斯尼亚语 bs 波斯语 fa 丹麦语 da 德语 de 俄语 ru 法语 fr 芬兰语 fi 高棉语 km 韩语 ko 加泰罗尼亚语 ca 捷克语 cs 克罗地亚语 hr 拉脱维亚语 lv 立陶宛语 lt 罗马尼亚语 ro 马耳他语 mt 马来西亚语 ms 马其顿语 mk 孟加拉语 bn 缅甸语 my 南非荷兰语 af 挪威语 no 葡萄牙语 pt 日语 ja 瑞典语 sv 塞尔维亚语 sr 斯洛伐克语 sk 斯洛文尼亚语 sl 斯瓦希里语 sw 泰语 th 土耳其语 tr 威尔士语 cy 乌尔都语 ur 乌克兰语 uk 西班牙语 es 希伯来语 he 希腊语 el 匈牙利语 hu 意大利语 it 印地语 hi 印尼语 id 英语 en 越南语 vi 中文 zh 无法识别语种 unk 当输入文本过短或不明确时，识别结果可能不准确； 当输入文本包含多种语言时，会返回占比最高的语种。 调用失败时无此字段。
     * @return detectedLanguage
     */
    public String getDetectedLanguage() {
        return detectedLanguage;
    }

    public void setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
    }

    

    public RunLanguageDetectionResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public RunLanguageDetectionResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 调用失败时的错误信息。调用成功时无此字段。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunLanguageDetectionResponse runLanguageDetectionResponse = (RunLanguageDetectionResponse) o;
        return Objects.equals(this.detectedLanguage, runLanguageDetectionResponse.detectedLanguage) &&
            Objects.equals(this.errorCode, runLanguageDetectionResponse.errorCode) &&
            Objects.equals(this.errorMsg, runLanguageDetectionResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(detectedLanguage, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunLanguageDetectionResponse {\n");
        sb.append("    detectedLanguage: ").append(toIndentedString(detectedLanguage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

