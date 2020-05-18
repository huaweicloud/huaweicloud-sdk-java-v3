package com.huaweicloud.sdk.image.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.image.v1.model.CelebrityRecognitionReq;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class RunCelebrityRecognitionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CelebrityRecognitionReq body = null;

    public RunCelebrityRecognitionRequest withBody(CelebrityRecognitionReq body) {
        this.body = body;
        return this;
    }

    public RunCelebrityRecognitionRequest withBody(Consumer<CelebrityRecognitionReq> bodySetter) {
        if(this.body == null ){
            this.body = new CelebrityRecognitionReq();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CelebrityRecognitionReq getBody() {
        return body;
    }

    public void setBody(CelebrityRecognitionReq body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCelebrityRecognitionRequest runCelebrityRecognitionRequest = (RunCelebrityRecognitionRequest) o;
        return Objects.equals(this.body, runCelebrityRecognitionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCelebrityRecognitionRequest {\n");
            sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

