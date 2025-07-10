package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDesktopPoolAuthorizedObjectsRequestBody
 */
public class CreateDesktopPoolAuthorizedObjectsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects")

    private List<AuthorizedObjects> objects = null;

    /**
     * 执行动作，ADD：增加授权用户/用户组，REMOVE：移除已授权用户/用户组。
     */
    public static final class ActionEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final ActionEnum ADD = new ActionEnum("ADD");

        /**
         * Enum REMOVE for value: "REMOVE"
         */
        public static final ActionEnum REMOVE = new ActionEnum("REMOVE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("REMOVE", REMOVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    public CreateDesktopPoolAuthorizedObjectsRequestBody withObjects(List<AuthorizedObjects> objects) {
        this.objects = objects;
        return this;
    }

    public CreateDesktopPoolAuthorizedObjectsRequestBody addObjectsItem(AuthorizedObjects objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public CreateDesktopPoolAuthorizedObjectsRequestBody withObjects(Consumer<List<AuthorizedObjects>> objectsSetter) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        objectsSetter.accept(this.objects);
        return this;
    }

    /**
     * 要授权的用户/用户组。
     * @return objects
     */
    public List<AuthorizedObjects> getObjects() {
        return objects;
    }

    public void setObjects(List<AuthorizedObjects> objects) {
        this.objects = objects;
    }

    public CreateDesktopPoolAuthorizedObjectsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 执行动作，ADD：增加授权用户/用户组，REMOVE：移除已授权用户/用户组。
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDesktopPoolAuthorizedObjectsRequestBody that = (CreateDesktopPoolAuthorizedObjectsRequestBody) obj;
        return Objects.equals(this.objects, that.objects) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objects, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDesktopPoolAuthorizedObjectsRequestBody {\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
