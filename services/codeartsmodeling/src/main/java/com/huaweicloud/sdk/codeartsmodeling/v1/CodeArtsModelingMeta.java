package com.huaweicloud.sdk.codeartsmodeling.v1;

import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramRequest;
import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramRequestBody;
import com.huaweicloud.sdk.codeartsmodeling.v1.model.ConvertPlantUml2DiagramResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsModelingMeta {

    public static final HttpRequestDef<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse> convertPlantUml2Diagram =
        genForConvertPlantUml2Diagram();

    private static HttpRequestDef<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse> genForConvertPlantUml2Diagram() {
        // basic
        HttpRequestDef.Builder<ConvertPlantUml2DiagramRequest, ConvertPlantUml2DiagramResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ConvertPlantUml2DiagramRequest.class, ConvertPlantUml2DiagramResponse.class)
            .withName("ConvertPlantUml2Diagram")
            .withUri("/CloudModelingDrawioSvr/v1/modelproject/plant-uml/convert-to-diagram")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("diagramUUID",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ConvertPlantUml2DiagramRequest::getDiagramUUID,
                ConvertPlantUml2DiagramRequest::setDiagramUUID));
        builder.<Boolean>withRequestField("is_clear",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ConvertPlantUml2DiagramRequest::getIsClear,
                ConvertPlantUml2DiagramRequest::setIsClear));
        builder.<ConvertPlantUml2DiagramRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConvertPlantUml2DiagramRequestBody.class),
            f -> f.withMarshaller(ConvertPlantUml2DiagramRequest::getBody, ConvertPlantUml2DiagramRequest::setBody));

        // response

        return builder.build();
    }

}
