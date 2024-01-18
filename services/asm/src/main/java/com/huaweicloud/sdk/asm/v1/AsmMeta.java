package com.huaweicloud.sdk.asm.v1;

import com.huaweicloud.sdk.asm.v1.model.CreateMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.CreateMeshResponse;
import com.huaweicloud.sdk.asm.v1.model.DeleteMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.DeleteMeshResponse;
import com.huaweicloud.sdk.asm.v1.model.ListMeshesRequest;
import com.huaweicloud.sdk.asm.v1.model.ListMeshesResponse;
import com.huaweicloud.sdk.asm.v1.model.Mesh;
import com.huaweicloud.sdk.asm.v1.model.ShowMeshRequest;
import com.huaweicloud.sdk.asm.v1.model.ShowMeshResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AsmMeta {

    public static final HttpRequestDef<CreateMeshRequest, CreateMeshResponse> createMesh = genForCreateMesh();

    private static HttpRequestDef<CreateMeshRequest, CreateMeshResponse> genForCreateMesh() {
        // basic
        HttpRequestDef.Builder<CreateMeshRequest, CreateMeshResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMeshRequest.class, CreateMeshResponse.class)
                .withName("CreateMesh")
                .withUri("/v1/meshes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMeshRequest::getXApplyProjectID, CreateMeshRequest::setXApplyProjectID));
        builder.<Mesh>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Mesh.class),
            f -> f.withMarshaller(CreateMeshRequest::getBody, CreateMeshRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMeshRequest, DeleteMeshResponse> deleteMesh = genForDeleteMesh();

    private static HttpRequestDef<DeleteMeshRequest, DeleteMeshResponse> genForDeleteMesh() {
        // basic
        HttpRequestDef.Builder<DeleteMeshRequest, DeleteMeshResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMeshRequest.class, DeleteMeshResponse.class)
                .withName("DeleteMesh")
                .withUri("/v1/meshes/{mesh_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mesh_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMeshRequest::getMeshId, DeleteMeshRequest::setMeshId));
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMeshRequest::getXApplyProjectID, DeleteMeshRequest::setXApplyProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMeshesRequest, ListMeshesResponse> listMeshes = genForListMeshes();

    private static HttpRequestDef<ListMeshesRequest, ListMeshesResponse> genForListMeshes() {
        // basic
        HttpRequestDef.Builder<ListMeshesRequest, ListMeshesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMeshesRequest.class, ListMeshesResponse.class)
                .withName("ListMeshes")
                .withUri("/v1/meshes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMeshesRequest::getXApplyProjectID, ListMeshesRequest::setXApplyProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMeshRequest, ShowMeshResponse> showMesh = genForShowMesh();

    private static HttpRequestDef<ShowMeshRequest, ShowMeshResponse> genForShowMesh() {
        // basic
        HttpRequestDef.Builder<ShowMeshRequest, ShowMeshResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMeshRequest.class, ShowMeshResponse.class)
                .withName("ShowMesh")
                .withUri("/v1/meshes/{mesh_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("mesh_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeshRequest::getMeshId, ShowMeshRequest::setMeshId));
        builder.<String>withRequestField("X-Apply-ProjectID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMeshRequest::getXApplyProjectID, ShowMeshRequest::setXApplyProjectID));

        // response

        return builder.build();
    }

}
