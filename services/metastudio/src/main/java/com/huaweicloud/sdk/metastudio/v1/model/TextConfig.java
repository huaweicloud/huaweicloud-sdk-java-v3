package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 台词脚本。 &gt; * 最长2000个字符，不含SSML标签字符数。
 */
public class TextConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public TextConfig withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 台词脚本。  支持两种模式，纯文本模式和标签模式。  ### 纯文本模式 纯文本模式，使用方法，如“大家好，我是人工智大家，是个虚拟主播”  ### 标签模式 标签模式的定义使用SSML（Speech Synthesis Markup Language）标记语言。  - **\\<speak>**    \\<speak>标签是所有文本的根节点。一切需要调用SSML标签的文本都要包含在\\<speak> \\</speak>对中。  - **\\<emotion>**    \\<emotion>标签是情感标签。对指定一句或多句话生效，标签开始在句子起始位置，标签关闭在句子结尾。用法：\\<emotion type=\"情感标签\">。type可取值包括：HAPPY、SAD、CALM、ANGER  - **\\<insert-action>**    \\<insert-action>标签是动作标签。在文本的指定位置插入动作。用法：\\<insert-action id=\"动作资产ID\" name=\"动作名称\" tag=\"动作标识\"/>。动作资产信息通过资产库接口查询获取。  - **\\<break>**     \\<break>标签是停顿标签。在文本的指定位置插入停顿。用法：\\<break time=\"停顿时长\"/>。停顿时长单位是毫秒，最小值200毫秒。  - **\\<phoneme>**     \\<phoneme>标签是多音字标签。多音字标签可以指定单个汉字的读音。标签起始和关闭之间只能包含1个汉字。属性可取值为汉语拼音，声调用1、2、3、4表示。用法：\\<phoneme ph=\"拼音\"/>字\\</phoneme>。   > * 举例：\\<speak> \\<emotion type=\\\"HAPPY\\\">\\<insert-action id=\"2692ea5d095caaafcfed21dc4590b701\" name=\"双手指尖交触\" tag=\"system_female_animation_0026\"/>大家好，\\<break time=\"200ms\"/>我是MetaStudio制作的人工智能数字人。\\</emotion>我带大家\\<phoneme ph=\"liao3\">了\\</phoneme>解MetaStudio。\\</speak> > * 分身数字人视频制作仅break和phoneme标签生效。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextConfig that = (TextConfig) obj;
        return Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextConfig {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
