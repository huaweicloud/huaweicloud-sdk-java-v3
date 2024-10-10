package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListWafWhiteIpRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black")

    private List<BlackWhiteListRule> black = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private List<BlackWhiteListRule> white = null;

    public ListWafWhiteIpRuleResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListWafWhiteIpRuleResponse withBlack(List<BlackWhiteListRule> black) {
        this.black = black;
        return this;
    }

    public ListWafWhiteIpRuleResponse addBlackItem(BlackWhiteListRule blackItem) {
        if (this.black == null) {
            this.black = new ArrayList<>();
        }
        this.black.add(blackItem);
        return this;
    }

    public ListWafWhiteIpRuleResponse withBlack(Consumer<List<BlackWhiteListRule>> blackSetter) {
        if (this.black == null) {
            this.black = new ArrayList<>();
        }
        blackSetter.accept(this.black);
        return this;
    }

    /**
     * black
     * @return black
     */
    public List<BlackWhiteListRule> getBlack() {
        return black;
    }

    public void setBlack(List<BlackWhiteListRule> black) {
        this.black = black;
    }

    public ListWafWhiteIpRuleResponse withWhite(List<BlackWhiteListRule> white) {
        this.white = white;
        return this;
    }

    public ListWafWhiteIpRuleResponse addWhiteItem(BlackWhiteListRule whiteItem) {
        if (this.white == null) {
            this.white = new ArrayList<>();
        }
        this.white.add(whiteItem);
        return this;
    }

    public ListWafWhiteIpRuleResponse withWhite(Consumer<List<BlackWhiteListRule>> whiteSetter) {
        if (this.white == null) {
            this.white = new ArrayList<>();
        }
        whiteSetter.accept(this.white);
        return this;
    }

    /**
     * white
     * @return white
     */
    public List<BlackWhiteListRule> getWhite() {
        return white;
    }

    public void setWhite(List<BlackWhiteListRule> white) {
        this.white = white;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWafWhiteIpRuleResponse that = (ListWafWhiteIpRuleResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.black, that.black)
            && Objects.equals(this.white, that.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, black, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWafWhiteIpRuleResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    black: ").append(toIndentedString(black)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
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
