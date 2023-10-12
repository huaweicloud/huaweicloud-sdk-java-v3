package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问控制配置，允许配置黑名单、白名单。
 */
public class AccessControl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "black")

    private List<Object> black = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private List<Object> white = null;

    public AccessControl withBlack(List<Object> black) {
        this.black = black;
        return this;
    }

    public AccessControl addBlackItem(Object blackItem) {
        if (this.black == null) {
            this.black = new ArrayList<>();
        }
        this.black.add(blackItem);
        return this;
    }

    public AccessControl withBlack(Consumer<List<Object>> blackSetter) {
        if (this.black == null) {
            this.black = new ArrayList<>();
        }
        blackSetter.accept(this.black);
        return this;
    }

    /**
     * 黑名单数组。 1.每行一个IP地址或网段，以回车结束。 2.每个IP地址组最多可添加300个IP地址或网段。
     * @return black
     */
    public List<Object> getBlack() {
        return black;
    }

    public void setBlack(List<Object> black) {
        this.black = black;
    }

    public AccessControl withWhite(List<Object> white) {
        this.white = white;
        return this;
    }

    public AccessControl addWhiteItem(Object whiteItem) {
        if (this.white == null) {
            this.white = new ArrayList<>();
        }
        this.white.add(whiteItem);
        return this;
    }

    public AccessControl withWhite(Consumer<List<Object>> whiteSetter) {
        if (this.white == null) {
            this.white = new ArrayList<>();
        }
        whiteSetter.accept(this.white);
        return this;
    }

    /**
     * 白名单数组。 1.每行一个IP地址或网段，以回车结束。 2.每个IP地址组最多可添加300个IP地址或网段。
     * @return white
     */
    public List<Object> getWhite() {
        return white;
    }

    public void setWhite(List<Object> white) {
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
        AccessControl that = (AccessControl) obj;
        return Objects.equals(this.black, that.black) && Objects.equals(this.white, that.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(black, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessControl {\n");
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
