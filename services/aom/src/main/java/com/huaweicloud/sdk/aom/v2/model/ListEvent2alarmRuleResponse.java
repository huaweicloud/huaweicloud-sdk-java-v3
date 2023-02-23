package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.Event2alarmRuleBody;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "ListEvent2alarmRuleResponse")
public class ListEvent2alarmRuleResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    @JacksonXmlProperty(localName = "body")
    private List<Event2alarmRuleBody> body = null;
    
    public ListEvent2alarmRuleResponse withBody(List<Event2alarmRuleBody> body) {
        this.body = body;
        return this;
    }

    
    public ListEvent2alarmRuleResponse addBodyItem(Event2alarmRuleBody bodyItem) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListEvent2alarmRuleResponse withBody(Consumer<List<Event2alarmRuleBody>> bodySetter) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<Event2alarmRuleBody> getBody() {
        return body;
    }

    public void setBody(List<Event2alarmRuleBody> body) {
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
        ListEvent2alarmRuleResponse listEvent2alarmRuleResponse = (ListEvent2alarmRuleResponse) o;
        return Objects.equals(this.body, listEvent2alarmRuleResponse.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEvent2alarmRuleResponse {\n");
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

