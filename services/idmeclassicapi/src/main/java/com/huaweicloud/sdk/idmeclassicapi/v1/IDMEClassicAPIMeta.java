package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVODeleteByConditionVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveAllDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelSaveDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOListPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsDecryptDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistObjectIdsModifierDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUniqueKeyDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestCountVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestSelectedVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestStaticsVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOQueryRequestVo;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelCreateDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RDMParamVOVersionModelSaveAsDTO;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;

@SuppressWarnings("unchecked")
public class IDMEClassicAPIMeta {

    public static final HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPost =
        genForbatchCreateUsingPost();

    private static HttpRequestDef<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> genForbatchCreateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateUsingPostRequest.class, BatchCreateUsingPostResponse.class)
            .withName("BatchCreateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchCreate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOListPersistableModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelCreateDTO.class),
            f -> f.withMarshaller(BatchCreateUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPost =
        genForbatchDeleteLogicalUsingPost();

    private static HttpRequestDef<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> genForbatchDeleteLogicalUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteLogicalUsingPostRequest.class,
                    BatchDeleteLogicalUsingPostResponse.class)
                .withName("BatchDeleteLogicalUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchLogicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteLogicalUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPost =
        genForbatchDeleteUsingPost();

    private static HttpRequestDef<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> genForbatchDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteUsingPostRequest.class, BatchDeleteUsingPostResponse.class)
            .withName("BatchDeleteUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchDelete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistObjectIdsModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsModifierDTO.class),
            f -> f.withMarshaller(BatchDeleteUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPost =
        genForbatchShowGetUsingPost();

    private static HttpRequestDef<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> genForbatchShowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchShowGetUsingPostRequest.class, BatchShowGetUsingPostResponse.class)
            .withName("BatchShowGetUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchGet")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistObjectIdsDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdsDecryptDTO.class),
            f -> f.withMarshaller(BatchShowGetUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPost =
        genForbatchUpdateUsingPost();

    private static HttpRequestDef<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> genForbatchUpdateUsingPost() {
        // basic
        HttpRequestDef.Builder<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchUpdateUsingPostRequest.class, BatchUpdateUsingPostResponse.class)
            .withName("BatchUpdateUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/batchUpdate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOListPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(BatchUpdateUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> countUsingPost =
        genForcountUsingPost();

    private static HttpRequestDef<CountUsingPostRequest, CountUsingPostResponse> genForcountUsingPost() {
        // basic
        HttpRequestDef.Builder<CountUsingPostRequest, CountUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountUsingPostRequest.class, CountUsingPostResponse.class)
                .withName("CountUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOQueryRequestCountVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestCountVo.class),
            f -> f.withMarshaller(CountUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPost =
        genForcreateUsingPost();

    private static HttpRequestDef<CreateUsingPostRequest, CreateUsingPostResponse> genForcreateUsingPost() {
        // basic
        HttpRequestDef.Builder<CreateUsingPostRequest, CreateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUsingPostRequest.class, CreateUsingPostResponse.class)
                .withName("CreateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOVersionModelCreateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelCreateDTO.class),
            f -> f.withMarshaller(CreateUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPost =
        genFordeleteByConditionUsingPost();

    private static HttpRequestDef<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> genFordeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteByConditionUsingPostRequest.class,
                    DeleteByConditionUsingPostResponse.class)
                .withName("DeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/deleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(DeleteByConditionUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPost =
        genFordeleteUsingPost();

    private static HttpRequestDef<DeleteUsingPostRequest, DeleteUsingPostResponse> genFordeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<DeleteUsingPostRequest, DeleteUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteUsingPostRequest.class, DeleteUsingPostResponse.class)
                .withName("DeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(DeleteUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPost =
        genForlistQueryUsingPost();

    private static HttpRequestDef<ListQueryUsingPostRequest, ListQueryUsingPostResponse> genForlistQueryUsingPost() {
        // basic
        HttpRequestDef.Builder<ListQueryUsingPostRequest, ListQueryUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListQueryUsingPostRequest.class, ListQueryUsingPostResponse.class)
                .withName("ListQueryUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/query/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSizePath, (req, v) -> {
                req.setPageSizePath(v);
            }));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPagePath, (req, v) -> {
                req.setCurPagePath(v);
            }));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getCurPage, (req, v) -> {
                req.setCurPage(v);
            }));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getEndIndex, (req, v) -> {
                req.setEndIndex(v);
            }));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getMaxPageSize, (req, v) -> {
                req.setMaxPageSize(v);
            }));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getStartIndex, (req, v) -> {
                req.setStartIndex(v);
            }));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalPages, (req, v) -> {
                req.setTotalPages(v);
            }));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getTotalRows, (req, v) -> {
                req.setTotalRows(v);
            }));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListQueryUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPost =
        genForlistSelectUsingPost();

    private static HttpRequestDef<ListSelectUsingPostRequest, ListSelectUsingPostResponse> genForlistSelectUsingPost() {
        // basic
        HttpRequestDef.Builder<ListSelectUsingPostRequest, ListSelectUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSelectUsingPostRequest.class, ListSelectUsingPostResponse.class)
                .withName("ListSelectUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/select/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSizePath, (req, v) -> {
                req.setPageSizePath(v);
            }));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPagePath, (req, v) -> {
                req.setCurPagePath(v);
            }));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getCurPage, (req, v) -> {
                req.setCurPage(v);
            }));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getEndIndex, (req, v) -> {
                req.setEndIndex(v);
            }));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getMaxPageSize, (req, v) -> {
                req.setMaxPageSize(v);
            }));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getStartIndex, (req, v) -> {
                req.setStartIndex(v);
            }));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalPages, (req, v) -> {
                req.setTotalPages(v);
            }));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getTotalRows, (req, v) -> {
                req.setTotalRows(v);
            }));
        builder.<RDMParamVOQueryRequestSelectedVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestSelectedVo.class),
            f -> f.withMarshaller(ListSelectUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> listUsingPost =
        genForlistUsingPost();

    private static HttpRequestDef<ListUsingPostRequest, ListUsingPostResponse> genForlistUsingPost() {
        // basic
        HttpRequestDef.Builder<ListUsingPostRequest, ListUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListUsingPostRequest.class, ListUsingPostResponse.class)
                .withName("ListUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/list/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSizePath, (req, v) -> {
                req.setPageSizePath(v);
            }));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPagePath, (req, v) -> {
                req.setCurPagePath(v);
            }));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getCurPage, (req, v) -> {
                req.setCurPage(v);
            }));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getEndIndex, (req, v) -> {
                req.setEndIndex(v);
            }));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getMaxPageSize, (req, v) -> {
                req.setMaxPageSize(v);
            }));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getStartIndex, (req, v) -> {
                req.setStartIndex(v);
            }));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalPages, (req, v) -> {
                req.setTotalPages(v);
            }));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingPostRequest::getTotalRows, (req, v) -> {
                req.setTotalRows(v);
            }));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ListUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPost =
        genForsaveAllUsingPost();

    private static HttpRequestDef<SaveAllUsingPostRequest, SaveAllUsingPostResponse> genForsaveAllUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAllUsingPostRequest, SaveAllUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAllUsingPostRequest.class, SaveAllUsingPostResponse.class)
                .withName("SaveAllUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAll")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOListPersistableModelSaveAllDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveAllDTO.class),
            f -> f.withMarshaller(SaveAllUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPost =
        genForsaveAsUsingPost();

    private static HttpRequestDef<SaveAsUsingPostRequest, SaveAsUsingPostResponse> genForsaveAsUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveAsUsingPostRequest, SaveAsUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveAsUsingPostRequest.class, SaveAsUsingPostResponse.class)
                .withName("SaveAsUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/saveAs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOVersionModelSaveAsDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOVersionModelSaveAsDTO.class),
            f -> f.withMarshaller(SaveAsUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPost =
        genForsaveUsingPost();

    private static HttpRequestDef<SaveUsingPostRequest, SaveUsingPostResponse> genForsaveUsingPost() {
        // basic
        HttpRequestDef.Builder<SaveUsingPostRequest, SaveUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveUsingPostRequest.class, SaveUsingPostResponse.class)
                .withName("SaveUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/save")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOListPersistableModelSaveDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOListPersistableModelSaveDTO.class),
            f -> f.withMarshaller(SaveUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPost =
        genForshowFindUsingPost();

    private static HttpRequestDef<ShowFindUsingPostRequest, ShowFindUsingPostResponse> genForshowFindUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowFindUsingPostRequest, ShowFindUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFindUsingPostRequest.class, ShowFindUsingPostResponse.class)
                .withName("ShowFindUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/find/{pageSizePath}/{curPagePath}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<Integer>withRequestField("pageSizePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSizePath, (req, v) -> {
                req.setPageSizePath(v);
            }));
        builder.<Integer>withRequestField("curPagePath",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPagePath, (req, v) -> {
                req.setCurPagePath(v);
            }));
        builder.<Integer>withRequestField("curPage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getCurPage, (req, v) -> {
                req.setCurPage(v);
            }));
        builder.<Integer>withRequestField("endIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getEndIndex, (req, v) -> {
                req.setEndIndex(v);
            }));
        builder.<Integer>withRequestField("maxPageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getMaxPageSize, (req, v) -> {
                req.setMaxPageSize(v);
            }));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("startIndex",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getStartIndex, (req, v) -> {
                req.setStartIndex(v);
            }));
        builder.<Integer>withRequestField("totalPages",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalPages, (req, v) -> {
                req.setTotalPages(v);
            }));
        builder.<Integer>withRequestField("totalRows",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getTotalRows, (req, v) -> {
                req.setTotalRows(v);
            }));
        builder.<RDMParamVOQueryRequestVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestVo.class),
            f -> f.withMarshaller(ShowFindUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKey =
        genForshowGetByUniqueKey();

    private static HttpRequestDef<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> genForshowGetByUniqueKey() {
        // basic
        HttpRequestDef.Builder<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetByUniqueKeyRequest.class, ShowGetByUniqueKeyResponse.class)
                .withName("ShowGetByUniqueKey")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/{getUniqueFieldMethod}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<String>withRequestField("getUniqueFieldMethod",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getGetUniqueFieldMethod, (req, v) -> {
                req.setGetUniqueFieldMethod(v);
            }));
        builder.<RDMParamVOPersistableModelUniqueKeyDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUniqueKeyDTO.class),
            f -> f.withMarshaller(ShowGetByUniqueKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPost =
        genForshowGetUsingPost();

    private static HttpRequestDef<ShowGetUsingPostRequest, ShowGetUsingPostResponse> genForshowGetUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowGetUsingPostRequest, ShowGetUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowGetUsingPostRequest.class, ShowGetUsingPostResponse.class)
                .withName("ShowGetUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/get")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistObjectIdDecryptDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdDecryptDTO.class),
            f -> f.withMarshaller(ShowGetUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPost =
        genForshowLogicalDeleteByConditionUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> genForshowLogicalDeleteByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteByConditionUsingPostRequest.class,
                    ShowLogicalDeleteByConditionUsingPostResponse.class)
                .withName("ShowLogicalDeleteByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDeleteByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVODeleteByConditionVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVODeleteByConditionVo.class),
            f -> f.withMarshaller(ShowLogicalDeleteByConditionUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPost =
        genForshowLogicalDeleteUsingPost();

    private static HttpRequestDef<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> genForshowLogicalDeleteUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowLogicalDeleteUsingPostRequest.class,
                    ShowLogicalDeleteUsingPostResponse.class)
                .withName("ShowLogicalDeleteUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/logicalDelete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistObjectIdModifierDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistObjectIdModifierDTO.class),
            f -> f.withMarshaller(ShowLogicalDeleteUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPost =
        genForshowStaticsUsingPost();

    private static HttpRequestDef<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> genForshowStaticsUsingPost() {
        // basic
        HttpRequestDef.Builder<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowStaticsUsingPostRequest.class, ShowStaticsUsingPostResponse.class)
            .withName("ShowStaticsUsingPost")
            .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/statics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOQueryRequestStaticsVo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOQueryRequestStaticsVo.class),
            f -> f.withMarshaller(ShowStaticsUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPost =
        genForupdateByConditionUsingPost();

    private static HttpRequestDef<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> genForupdateByConditionUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateByConditionUsingPostRequest.class,
                    UpdateByConditionUsingPostResponse.class)
                .withName("UpdateByConditionUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/updateByCondition")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOUpdateByConditionVoPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateByConditionUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPost =
        genForupdateUsingPost();

    private static HttpRequestDef<UpdateUsingPostRequest, UpdateUsingPostResponse> genForupdateUsingPost() {
        // basic
        HttpRequestDef.Builder<UpdateUsingPostRequest, UpdateUsingPostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateUsingPostRequest.class, UpdateUsingPostResponse.class)
                .withName("UpdateUsingPost")
                .withUri("/rdm_{identifier}_app/publicservices/api/{modelName}/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("identifier",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("modelName",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getModelName, (req, v) -> {
                req.setModelName(v);
            }));
        builder.<RDMParamVOPersistableModelUpdateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RDMParamVOPersistableModelUpdateDTO.class),
            f -> f.withMarshaller(UpdateUsingPostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
