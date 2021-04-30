package com.huaweicloud.sdk.mpc.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.MulInputFileInfo;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Subtitle
 */
public class Subtitle  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inputs")
    
    private List<MulInputFileInfo> inputs = null;
        /**
     * 字幕类型。取值如下：  - 0，表示不输出字幕 - 1，表示外部字幕文件嵌入视频流 - 2，表示输出WebVTT格式字幕 
     */
    public static final class SubtitleTypeEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final SubtitleTypeEnum NUMBER_0 = new SubtitleTypeEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final SubtitleTypeEnum NUMBER_1 = new SubtitleTypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final SubtitleTypeEnum NUMBER_2 = new SubtitleTypeEnum(2);
        

        private static final Map<Integer, SubtitleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SubtitleTypeEnum> createStaticFields() {
            Map<Integer, SubtitleTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SubtitleTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SubtitleTypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            SubtitleTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SubtitleTypeEnum(value);
            }
            return result;
        }

        public static SubtitleTypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            SubtitleTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SubtitleTypeEnum) {
                return this.value.equals(((SubtitleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subtitle_type")
    
    private SubtitleTypeEnum subtitleType;

    public Subtitle withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public Subtitle withInput(Consumer<ObsObjInfo> inputSetter) {
        if(this.input == null ){
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }
        
        return this;
    }


    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    

    public Subtitle withInputs(List<MulInputFileInfo> inputs) {
        this.inputs = inputs;
        return this;
    }

    
    public Subtitle addInputsItem(MulInputFileInfo inputsItem) {
        if(this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public Subtitle withInputs(Consumer<List<MulInputFileInfo>> inputsSetter) {
        if(this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 多字幕文件地址。 
     * @return inputs
     */
    public List<MulInputFileInfo> getInputs() {
        return inputs;
    }

    public void setInputs(List<MulInputFileInfo> inputs) {
        this.inputs = inputs;
    }

    

    public Subtitle withSubtitleType(SubtitleTypeEnum subtitleType) {
        this.subtitleType = subtitleType;
        return this;
    }

    


    /**
     * 字幕类型。取值如下：  - 0，表示不输出字幕 - 1，表示外部字幕文件嵌入视频流 - 2，表示输出WebVTT格式字幕 
     * minimum: 0
     * maximum: 2
     * @return subtitleType
     */
    public SubtitleTypeEnum getSubtitleType() {
        return subtitleType;
    }

    public void setSubtitleType(SubtitleTypeEnum subtitleType) {
        this.subtitleType = subtitleType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subtitle subtitle = (Subtitle) o;
        return Objects.equals(this.input, subtitle.input) &&
            Objects.equals(this.inputs, subtitle.inputs) &&
            Objects.equals(this.subtitleType, subtitle.subtitleType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(input, inputs, subtitleType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subtitle {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    subtitleType: ").append(toIndentedString(subtitleType)).append("\n");
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

