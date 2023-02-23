package com.huaweicloud.sdk.imagesearch.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.imagesearch.v1.model.*;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class ImageSearchMeta {

    public static final HttpRequestDef<RunAddPictureRequest, RunAddPictureResponse> runAddPicture = genForrunAddPicture();

    private static HttpRequestDef<RunAddPictureRequest, RunAddPictureResponse> genForrunAddPicture() {
        // basic
        HttpRequestDef.Builder<RunAddPictureRequest, RunAddPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunAddPictureRequest.class, RunAddPictureResponse.class)
                .withName("RunAddPicture")
                .withUri("/v1/{project_id}/{instance_name}/image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunAddPictureRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );
        builder.<AddPictureRequestReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddPictureRequestReq.class),
            f -> f.withMarshaller(RunAddPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunCheckPictureRequest, RunCheckPictureResponse> runCheckPicture = genForrunCheckPicture();

    private static HttpRequestDef<RunCheckPictureRequest, RunCheckPictureResponse> genForrunCheckPicture() {
        // basic
        HttpRequestDef.Builder<RunCheckPictureRequest, RunCheckPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunCheckPictureRequest.class, RunCheckPictureResponse.class)
                .withName("RunCheckPicture")
                .withUri("/v1/{project_id}/{instance_name}/image/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunCheckPictureRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );
        builder.<DeletePictureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeletePictureReq.class),
            f -> f.withMarshaller(RunCheckPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunCreateInstanceRequest, RunCreateInstanceResponse> runCreateInstance = genForrunCreateInstance();

    private static HttpRequestDef<RunCreateInstanceRequest, RunCreateInstanceResponse> genForrunCreateInstance() {
        // basic
        HttpRequestDef.Builder<RunCreateInstanceRequest, RunCreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunCreateInstanceRequest.class, RunCreateInstanceResponse.class)
                .withName("RunCreateInstance")
                .withUri("/v1/{project_id}/service")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceReq.class),
            f -> f.withMarshaller(RunCreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunDeleteInstanceRequest, RunDeleteInstanceResponse> runDeleteInstance = genForrunDeleteInstance();

    private static HttpRequestDef<RunDeleteInstanceRequest, RunDeleteInstanceResponse> genForrunDeleteInstance() {
        // basic
        HttpRequestDef.Builder<RunDeleteInstanceRequest, RunDeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RunDeleteInstanceRequest.class, RunDeleteInstanceResponse.class)
                .withName("RunDeleteInstance")
                .withUri("/v1/{project_id}/service/{instance_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunDeleteInstanceRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunDeletePictureRequest, RunDeletePictureResponse> runDeletePicture = genForrunDeletePicture();

    private static HttpRequestDef<RunDeletePictureRequest, RunDeletePictureResponse> genForrunDeletePicture() {
        // basic
        HttpRequestDef.Builder<RunDeletePictureRequest, RunDeletePictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RunDeletePictureRequest.class, RunDeletePictureResponse.class)
                .withName("RunDeletePicture")
                .withUri("/v1/{project_id}/{instance_name}/image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunDeletePictureRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );
        builder.<DeletePictureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeletePictureReq.class),
            f -> f.withMarshaller(RunDeletePictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunModifyPictureRequest, RunModifyPictureResponse> runModifyPicture = genForrunModifyPicture();

    private static HttpRequestDef<RunModifyPictureRequest, RunModifyPictureResponse> genForrunModifyPicture() {
        // basic
        HttpRequestDef.Builder<RunModifyPictureRequest, RunModifyPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RunModifyPictureRequest.class, RunModifyPictureResponse.class)
                .withName("RunModifyPicture")
                .withUri("/v1/{project_id}/{instance_name}/image")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunModifyPictureRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );
        builder.<RunModifyPictureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunModifyPictureReq.class),
            f -> f.withMarshaller(RunModifyPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunQueryInstanceRequest, RunQueryInstanceResponse> runQueryInstance = genForrunQueryInstance();

    private static HttpRequestDef<RunQueryInstanceRequest, RunQueryInstanceResponse> genForrunQueryInstance() {
        // basic
        HttpRequestDef.Builder<RunQueryInstanceRequest, RunQueryInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RunQueryInstanceRequest.class, RunQueryInstanceResponse.class)
                .withName("RunQueryInstance")
                .withUri("/v1/{project_id}/service/{instance_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunQueryInstanceRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );

        // response


        return builder.build();
    }

    public static final HttpRequestDef<RunSearchPictureRequest, RunSearchPictureResponse> runSearchPicture = genForrunSearchPicture();

    private static HttpRequestDef<RunSearchPictureRequest, RunSearchPictureResponse> genForrunSearchPicture() {
        // basic
        HttpRequestDef.Builder<RunSearchPictureRequest, RunSearchPictureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSearchPictureRequest.class, RunSearchPictureResponse.class)
                .withName("RunSearchPicture")
                .withUri("/v1/{project_id}/{instance_name}/image/search")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSearchPictureRequest::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            })
        );
        builder.<SearchPictureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchPictureReq.class),
            f -> f.withMarshaller(RunSearchPictureRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response


        return builder.build();
    }

}
