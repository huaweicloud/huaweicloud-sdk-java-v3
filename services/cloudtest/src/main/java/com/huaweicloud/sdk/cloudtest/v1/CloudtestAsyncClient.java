package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.AddFeatureRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddFeatureResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddResourcesForIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddResourcesForIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteFacotrByIdsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteFacotrByIdsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchRemoveTestCasesFromIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchRemoveTestCasesFromIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchUpdateVersionTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchUpdateVersionTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBackupMindmapRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBackupMindmapResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateProjectBranchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateProjectBranchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateUserDefinedUrlKeyWordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateUserDefinedUrlKeyWordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateVersionTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateVersionTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteBasicAwByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteBasicAwByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteFacotrByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteFacotrByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapBackupByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapBackupByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapRecycleByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapRecycleByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTemplateByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTemplateByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DownloadAssetTemplateRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DownloadAssetTemplateResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ExportFactorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ExportFactorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlarmStatisticsUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlarmStatisticsUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAvailableConfigRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAvailableConfigResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwInfoListSupportsSearchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwInfoListSupportsSearchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListCasesStatusRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListCasesStatusResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListDomainVisibleServicesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListDomainVisibleServicesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListLinesUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListLinesUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListMsgInfosUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListMsgInfosUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListOwnTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListOwnTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListScattersUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListScattersUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListSubTaskCaseOverstockUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListSubTaskCaseOverstockUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskAssignCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskAssignCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTasksRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTasksResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseCommentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseCommentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseScriptDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseScriptDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesByIssueRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesByIssueResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasePlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasePlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsingGetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsingGetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesFromIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesFromIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBranchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBranchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowCaseResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowConcurrencyPackageUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowConcurrencyPackageUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDefaultTemplateByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDefaultTemplateByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowEchoTestPackageUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowEchoTestPackageUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByAssetIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByAssetIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindMapByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindMapByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowOperationalDataCurrentMonthUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowOperationalDataCurrentMonthUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReviewByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReviewByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSceneByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSceneByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowStatisticByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowStatisticByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseReviewsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseReviewsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCasesChangeStatisticsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCasesChangeStatisticsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestpointByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestpointByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateMindmapNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateMindmapNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseAndScriptRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseAndScriptResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateVersionTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateVersionTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UploadStepImgRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UploadStepImgResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudtestAsyncClient {

    protected HcClient hcClient;

    public CloudtestAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudtestAsyncClient> newBuilder() {
        ClientBuilder<CloudtestAsyncClient> clientBuilder = new ClientBuilder<>(CloudtestAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 新增用例评论
     *
     * 新增用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTestCaseCommentRequest 请求对象
     * @return CompletableFuture<AddTestCaseCommentResponse>
     */
    public CompletableFuture<AddTestCaseCommentResponse> addTestCaseCommentAsync(AddTestCaseCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.addTestCaseComment);
    }

    /**
     * 新增用例评论
     *
     * 新增用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTestCaseCommentRequest 请求对象
     * @return AsyncInvoker<AddTestCaseCommentRequest, AddTestCaseCommentResponse>
     */
    public AsyncInvoker<AddTestCaseCommentRequest, AddTestCaseCommentResponse> addTestCaseCommentAsyncInvoker(
        AddTestCaseCommentRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.addTestCaseComment, hcClient);
    }

    /**
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return CompletableFuture<BatchAddRelationsByOneCaseResponse>
     */
    public CompletableFuture<BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCaseAsync(
        BatchAddRelationsByOneCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchAddRelationsByOneCase);
    }

    /**
     * 添加需求/缺陷和多个用例关联关系
     *
     * 添加需求/缺陷和多个用例关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddRelationsByOneCaseRequest 请求对象
     * @return AsyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse>
     */
    public AsyncInvoker<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCaseAsyncInvoker(
        BatchAddRelationsByOneCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchAddRelationsByOneCase, hcClient);
    }

    /**
     * 向迭代中添加资源
     *
     * 向迭代中添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourcesForIteratorRequest 请求对象
     * @return CompletableFuture<BatchAddResourcesForIteratorResponse>
     */
    public CompletableFuture<BatchAddResourcesForIteratorResponse> batchAddResourcesForIteratorAsync(
        BatchAddResourcesForIteratorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchAddResourcesForIterator);
    }

    /**
     * 向迭代中添加资源
     *
     * 向迭代中添加资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddResourcesForIteratorRequest 请求对象
     * @return AsyncInvoker<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse>
     */
    public AsyncInvoker<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse> batchAddResourcesForIteratorAsyncInvoker(
        BatchAddResourcesForIteratorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchAddResourcesForIterator, hcClient);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestCaseResponse>
     */
    public CompletableFuture<BatchDeleteTestCaseResponse> batchDeleteTestCaseAsync(BatchDeleteTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestCase);
    }

    /**
     * 批量删除自定义测试服务类型用例
     *
     * 批量删除自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCaseRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse>
     */
    public AsyncInvoker<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCaseAsyncInvoker(
        BatchDeleteTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchDeleteTestCase, hcClient);
    }

    /**
     * 批量删除用例
     *
     * 批量删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCasesRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestCasesResponse>
     */
    public CompletableFuture<BatchDeleteTestCasesResponse> batchDeleteTestCasesAsync(
        BatchDeleteTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestCases);
    }

    /**
     * 批量删除用例
     *
     * 批量删除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestCasesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse>
     */
    public AsyncInvoker<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse> batchDeleteTestCasesAsyncInvoker(
        BatchDeleteTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchDeleteTestCases, hcClient);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return CompletableFuture<BatchDeleteTestReportResponse>
     */
    public CompletableFuture<BatchDeleteTestReportResponse> batchDeleteTestReportAsync(
        BatchDeleteTestReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteTestReport);
    }

    /**
     * 根据测试报告uri列表，删除测试报告
     *
     * 根据测试报告uri列表，删除测试报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTestReportRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse>
     */
    public AsyncInvoker<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> batchDeleteTestReportAsyncInvoker(
        BatchDeleteTestReportRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchDeleteTestReport, hcClient);
    }

    /**
     * 从迭代中批量移除用例
     *
     * 从迭代中批量移除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveTestCasesFromIteratorRequest 请求对象
     * @return CompletableFuture<BatchRemoveTestCasesFromIteratorResponse>
     */
    public CompletableFuture<BatchRemoveTestCasesFromIteratorResponse> batchRemoveTestCasesFromIteratorAsync(
        BatchRemoveTestCasesFromIteratorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchRemoveTestCasesFromIterator);
    }

    /**
     * 从迭代中批量移除用例
     *
     * 从迭代中批量移除用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveTestCasesFromIteratorRequest 请求对象
     * @return AsyncInvoker<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse>
     */
    public AsyncInvoker<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse> batchRemoveTestCasesFromIteratorAsyncInvoker(
        BatchRemoveTestCasesFromIteratorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchRemoveTestCasesFromIterator, hcClient);
    }

    /**
     * 批量更新用例属性
     *
     * 批量更新用例属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionTestCasesRequest 请求对象
     * @return CompletableFuture<BatchUpdateVersionTestCasesResponse>
     */
    public CompletableFuture<BatchUpdateVersionTestCasesResponse> batchUpdateVersionTestCasesAsync(
        BatchUpdateVersionTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchUpdateVersionTestCases);
    }

    /**
     * 批量更新用例属性
     *
     * 批量更新用例属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionTestCasesRequest 请求对象
     * @return AsyncInvoker<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse>
     */
    public AsyncInvoker<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse> batchUpdateVersionTestCasesAsyncInvoker(
        BatchUpdateVersionTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchUpdateVersionTestCases, hcClient);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return CompletableFuture<CheckPermissionResponse>
     */
    public CompletableFuture<CheckPermissionResponse> checkPermissionAsync(CheckPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.checkPermission);
    }

    /**
     * 检查项目权限
     *
     * 检查项目权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckPermissionRequest 请求对象
     * @return AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse>
     */
    public AsyncInvoker<CheckPermissionRequest, CheckPermissionResponse> checkPermissionAsyncInvoker(
        CheckPermissionRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.checkPermission, hcClient);
    }

    /**
     * 新增迭代
     *
     * 新增迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIteratorRequest 请求对象
     * @return CompletableFuture<CreateIteratorResponse>
     */
    public CompletableFuture<CreateIteratorResponse> createIteratorAsync(CreateIteratorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createIterator);
    }

    /**
     * 新增迭代
     *
     * 新增迭代
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIteratorRequest 请求对象
     * @return AsyncInvoker<CreateIteratorRequest, CreateIteratorResponse>
     */
    public AsyncInvoker<CreateIteratorRequest, CreateIteratorResponse> createIteratorAsyncInvoker(
        CreateIteratorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createIterator, hcClient);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return CompletableFuture<CreatePlanResponse>
     */
    public CompletableFuture<CreatePlanResponse> createPlanAsync(CreatePlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createPlan);
    }

    /**
     * 项目下创建计划
     *
     * 项目下创建计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePlanRequest 请求对象
     * @return AsyncInvoker<CreatePlanRequest, CreatePlanResponse>
     */
    public AsyncInvoker<CreatePlanRequest, CreatePlanResponse> createPlanAsyncInvoker(CreatePlanRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createPlan, hcClient);
    }

    /**
     * 新增分支
     *
     * 新增分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectBranchRequest 请求对象
     * @return CompletableFuture<CreateProjectBranchResponse>
     */
    public CompletableFuture<CreateProjectBranchResponse> createProjectBranchAsync(CreateProjectBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createProjectBranch);
    }

    /**
     * 新增分支
     *
     * 新增分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectBranchRequest 请求对象
     * @return AsyncInvoker<CreateProjectBranchRequest, CreateProjectBranchResponse>
     */
    public AsyncInvoker<CreateProjectBranchRequest, CreateProjectBranchResponse> createProjectBranchAsyncInvoker(
        CreateProjectBranchRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createProjectBranch, hcClient);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return CompletableFuture<CreateRelationsByOneCaseResponse>
     */
    public CompletableFuture<CreateRelationsByOneCaseResponse> createRelationsByOneCaseAsync(
        CreateRelationsByOneCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createRelationsByOneCase);
    }

    /**
     * 添加一个用例和多个需求/缺陷关联关系
     *
     * 添加一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRelationsByOneCaseRequest 请求对象
     * @return AsyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse>
     */
    public AsyncInvoker<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> createRelationsByOneCaseAsyncInvoker(
        CreateRelationsByOneCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createRelationsByOneCase, hcClient);
    }

    /**
     * 保存单个自定义报表
     *
     * 保存单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return CompletableFuture<CreateReportResponse>
     */
    public CompletableFuture<CreateReportResponse> createReportAsync(CreateReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createReport);
    }

    /**
     * 保存单个自定义报表
     *
     * 保存单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReportRequest 请求对象
     * @return AsyncInvoker<CreateReportRequest, CreateReportResponse>
     */
    public AsyncInvoker<CreateReportRequest, CreateReportResponse> createReportAsyncInvoker(
        CreateReportRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createReport, hcClient);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return CompletableFuture<CreateResourceUriResponse>
     */
    public CompletableFuture<CreateResourceUriResponse> createResourceUriAsync(CreateResourceUriRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createResourceUri);
    }

    /**
     * 生成资源URI
     *
     * 生成资源URI
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceUriRequest 请求对象
     * @return AsyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse>
     */
    public AsyncInvoker<CreateResourceUriRequest, CreateResourceUriResponse> createResourceUriAsyncInvoker(
        CreateResourceUriRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createResourceUri, hcClient);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return CompletableFuture<CreateServiceResponse>
     */
    public CompletableFuture<CreateServiceResponse> createServiceAsync(CreateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createService);
    }

    /**
     * 新测试类型服务注册
     *
     * 通过接口CreateService注册成为自定义服务。 注册完成后界面将会出现此自定义测试类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateServiceRequest 请求对象
     * @return AsyncInvoker<CreateServiceRequest, CreateServiceResponse>
     */
    public AsyncInvoker<CreateServiceRequest, CreateServiceResponse> createServiceAsyncInvoker(
        CreateServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createService, hcClient);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return CompletableFuture<CreateTestCaseResponse>
     */
    public CompletableFuture<CreateTestCaseResponse> createTestCaseAsync(CreateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCase);
    }

    /**
     * 创建自定义测试服务类型用例
     *
     * 创建自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse>
     */
    public AsyncInvoker<CreateTestCaseRequest, CreateTestCaseResponse> createTestCaseAsyncInvoker(
        CreateTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createTestCase, hcClient);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return CompletableFuture<CreateTestCaseInPlanResponse>
     */
    public CompletableFuture<CreateTestCaseInPlanResponse> createTestCaseInPlanAsync(
        CreateTestCaseInPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTestCaseInPlan);
    }

    /**
     * 计划中批量添加测试用例
     *
     * 计划中批量添加测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTestCaseInPlanRequest 请求对象
     * @return AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse>
     */
    public AsyncInvoker<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlanAsyncInvoker(
        CreateTestCaseInPlanRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createTestCaseInPlan, hcClient);
    }

    /**
     * 新增用户自定义URL关键字
     *
     * 新增用户自定义URL关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDefinedUrlKeyWordRequest 请求对象
     * @return CompletableFuture<CreateUserDefinedUrlKeyWordResponse>
     */
    public CompletableFuture<CreateUserDefinedUrlKeyWordResponse> createUserDefinedUrlKeyWordAsync(
        CreateUserDefinedUrlKeyWordRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createUserDefinedUrlKeyWord);
    }

    /**
     * 新增用户自定义URL关键字
     *
     * 新增用户自定义URL关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUserDefinedUrlKeyWordRequest 请求对象
     * @return AsyncInvoker<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse>
     */
    public AsyncInvoker<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse> createUserDefinedUrlKeyWordAsyncInvoker(
        CreateUserDefinedUrlKeyWordRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createUserDefinedUrlKeyWord, hcClient);
    }

    /**
     * 在分支或者测试计划下创建用例
     *
     * 在分支或者测试计划下创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVersionTestCaseRequest 请求对象
     * @return CompletableFuture<CreateVersionTestCaseResponse>
     */
    public CompletableFuture<CreateVersionTestCaseResponse> createVersionTestCaseAsync(
        CreateVersionTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createVersionTestCase);
    }

    /**
     * 在分支或者测试计划下创建用例
     *
     * 在分支或者测试计划下创建用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateVersionTestCaseRequest 请求对象
     * @return AsyncInvoker<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse>
     */
    public AsyncInvoker<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse> createVersionTestCaseAsyncInvoker(
        CreateVersionTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createVersionTestCase, hcClient);
    }

    /**
     * 融合版本删除单个basicAw
     *
     * 融合版本删除单个basicAw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBasicAwByIdRequest 请求对象
     * @return CompletableFuture<DeleteBasicAwByIdResponse>
     */
    public CompletableFuture<DeleteBasicAwByIdResponse> deleteBasicAwByIdAsync(DeleteBasicAwByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteBasicAwById);
    }

    /**
     * 融合版本删除单个basicAw
     *
     * 融合版本删除单个basicAw
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBasicAwByIdRequest 请求对象
     * @return AsyncInvoker<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse>
     */
    public AsyncInvoker<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse> deleteBasicAwByIdAsyncInvoker(
        DeleteBasicAwByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteBasicAwById, hcClient);
    }

    /**
     * 删除因子
     *
     * 删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFacotrByIdRequest 请求对象
     * @return CompletableFuture<DeleteFacotrByIdResponse>
     */
    public CompletableFuture<DeleteFacotrByIdResponse> deleteFacotrByIdAsync(DeleteFacotrByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteFacotrById);
    }

    /**
     * 删除因子
     *
     * 删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFacotrByIdRequest 请求对象
     * @return AsyncInvoker<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse>
     */
    public AsyncInvoker<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse> deleteFacotrByIdAsyncInvoker(
        DeleteFacotrByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteFacotrById, hcClient);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return CompletableFuture<DeleteRelationsByOneCaseResponse>
     */
    public CompletableFuture<DeleteRelationsByOneCaseResponse> deleteRelationsByOneCaseAsync(
        DeleteRelationsByOneCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteRelationsByOneCase);
    }

    /**
     * 删除一个用例和多个需求/缺陷关联关系
     *
     * 删除一个用例和多个需求/缺陷关联关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRelationsByOneCaseRequest 请求对象
     * @return AsyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse>
     */
    public AsyncInvoker<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> deleteRelationsByOneCaseAsyncInvoker(
        DeleteRelationsByOneCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteRelationsByOneCase, hcClient);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return CompletableFuture<DeleteServiceResponse>
     */
    public CompletableFuture<DeleteServiceResponse> deleteServiceAsync(DeleteServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteService);
    }

    /**
     * 删除已注册服务
     *
     * 删除已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse>
     */
    public AsyncInvoker<DeleteServiceRequest, DeleteServiceResponse> deleteServiceAsyncInvoker(
        DeleteServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteService, hcClient);
    }

    /**
     * 删除用例评论
     *
     * 删除用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTestCaseCommentRequest 请求对象
     * @return CompletableFuture<DeleteTestCaseCommentResponse>
     */
    public CompletableFuture<DeleteTestCaseCommentResponse> deleteTestCaseCommentAsync(
        DeleteTestCaseCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteTestCaseComment);
    }

    /**
     * 删除用例评论
     *
     * 删除用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTestCaseCommentRequest 请求对象
     * @return AsyncInvoker<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse>
     */
    public AsyncInvoker<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse> deleteTestCaseCommentAsyncInvoker(
        DeleteTestCaseCommentRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteTestCaseComment, hcClient);
    }

    /**
     * 查询告警统计数据
     *
     * 查询告警统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsUsingRequest 请求对象
     * @return CompletableFuture<ListAlarmStatisticsUsingResponse>
     */
    public CompletableFuture<ListAlarmStatisticsUsingResponse> listAlarmStatisticsUsingAsync(
        ListAlarmStatisticsUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAlarmStatisticsUsing);
    }

    /**
     * 查询告警统计数据
     *
     * 查询告警统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlarmStatisticsUsingRequest 请求对象
     * @return AsyncInvoker<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse>
     */
    public AsyncInvoker<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse> listAlarmStatisticsUsingAsyncInvoker(
        ListAlarmStatisticsUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAlarmStatisticsUsing, hcClient);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return CompletableFuture<ListAlertGroupsByConditionResponse>
     */
    public CompletableFuture<ListAlertGroupsByConditionResponse> listAlertGroupsByConditionAsync(
        ListAlertGroupsByConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAlertGroupsByCondition);
    }

    /**
     * 查询告警组列表
     *
     * 查询告警组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertGroupsByConditionRequest 请求对象
     * @return AsyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse>
     */
    public AsyncInvoker<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> listAlertGroupsByConditionAsyncInvoker(
        ListAlertGroupsByConditionRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAlertGroupsByCondition, hcClient);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return CompletableFuture<ListAlertTemplatesResponse>
     */
    public CompletableFuture<ListAlertTemplatesResponse> listAlertTemplatesAsync(ListAlertTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAlertTemplates);
    }

    /**
     * 查询告警模板
     *
     * 查询告警模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAlertTemplatesRequest 请求对象
     * @return AsyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse>
     */
    public AsyncInvoker<ListAlertTemplatesRequest, ListAlertTemplatesResponse> listAlertTemplatesAsyncInvoker(
        ListAlertTemplatesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAlertTemplates, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return CompletableFuture<ListAllBranchesResponse>
     */
    public CompletableFuture<ListAllBranchesResponse> listAllBranchesAsync(ListAllBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllBranchesRequest 请求对象
     * @return AsyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse>
     */
    public AsyncInvoker<ListAllBranchesRequest, ListAllBranchesResponse> listAllBranchesAsyncInvoker(
        ListAllBranchesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllBranches, hcClient);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return CompletableFuture<ListAllConfigItemByTypeResponse>
     */
    public CompletableFuture<ListAllConfigItemByTypeResponse> listAllConfigItemByTypeAsync(
        ListAllConfigItemByTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllConfigItemByType);
    }

    /**
     * 查询任务告警信息
     *
     * 查询任务告警信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllConfigItemByTypeRequest 请求对象
     * @return AsyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse>
     */
    public AsyncInvoker<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> listAllConfigItemByTypeAsyncInvoker(
        ListAllConfigItemByTypeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllConfigItemByType, hcClient);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return CompletableFuture<ListAllIteratorsResponse>
     */
    public CompletableFuture<ListAllIteratorsResponse> listAllIteratorsAsync(ListAllIteratorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllIterators);
    }

    /**
     * 查询项目下所有迭代计划
     *
     * 查询项目下所有迭代计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllIteratorsRequest 请求对象
     * @return AsyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse>
     */
    public AsyncInvoker<ListAllIteratorsRequest, ListAllIteratorsResponse> listAllIteratorsAsyncInvoker(
        ListAllIteratorsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllIterators, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTestCasesRequest 请求对象
     * @return CompletableFuture<ListAllTestCasesResponse>
     */
    public CompletableFuture<ListAllTestCasesResponse> listAllTestCasesAsync(ListAllTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAllTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTestCasesRequest 请求对象
     * @return AsyncInvoker<ListAllTestCasesRequest, ListAllTestCasesResponse>
     */
    public AsyncInvoker<ListAllTestCasesRequest, ListAllTestCasesResponse> listAllTestCasesAsyncInvoker(
        ListAllTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAllTestCases, hcClient);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return CompletableFuture<ListAttachmentsResponse>
     */
    public CompletableFuture<ListAttachmentsResponse> listAttachmentsAsync(ListAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAttachments);
    }

    /**
     * 查询附件列表
     *
     * 查询附件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>
     */
    public AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsAsyncInvoker(
        ListAttachmentsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAttachments, hcClient);
    }

    /**
     * 获取当前局点功能是否开启
     *
     * 获取当前局点功能是否开启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableConfigRequest 请求对象
     * @return CompletableFuture<ListAvailableConfigResponse>
     */
    public CompletableFuture<ListAvailableConfigResponse> listAvailableConfigAsync(ListAvailableConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listAvailableConfig);
    }

    /**
     * 获取当前局点功能是否开启
     *
     * 获取当前局点功能是否开启
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableConfigRequest 请求对象
     * @return AsyncInvoker<ListAvailableConfigRequest, ListAvailableConfigResponse>
     */
    public AsyncInvoker<ListAvailableConfigRequest, ListAvailableConfigResponse> listAvailableConfigAsyncInvoker(
        ListAvailableConfigRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listAvailableConfig, hcClient);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return CompletableFuture<ListBasicAwResponse>
     */
    public CompletableFuture<ListBasicAwResponse> listBasicAwAsync(ListBasicAwRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listBasicAw);
    }

    /**
     * 根据id获取单个basicAW信息
     *
     * 根据id获取单个basicAW信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwRequest 请求对象
     * @return AsyncInvoker<ListBasicAwRequest, ListBasicAwResponse>
     */
    public AsyncInvoker<ListBasicAwRequest, ListBasicAwResponse> listBasicAwAsyncInvoker(ListBasicAwRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listBasicAw, hcClient);
    }

    /**
     * 分页获取工程BasicAW详细信息列表（含目录）
     *
     * 分页获取工程BasicAW列表（含目录）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwInfoListSupportsSearchRequest 请求对象
     * @return CompletableFuture<ListBasicAwInfoListSupportsSearchResponse>
     */
    public CompletableFuture<ListBasicAwInfoListSupportsSearchResponse> listBasicAwInfoListSupportsSearchAsync(
        ListBasicAwInfoListSupportsSearchRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listBasicAwInfoListSupportsSearch);
    }

    /**
     * 分页获取工程BasicAW详细信息列表（含目录）
     *
     * 分页获取工程BasicAW列表（含目录）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBasicAwInfoListSupportsSearchRequest 请求对象
     * @return AsyncInvoker<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse>
     */
    public AsyncInvoker<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse> listBasicAwInfoListSupportsSearchAsyncInvoker(
        ListBasicAwInfoListSupportsSearchRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listBasicAwInfoListSupportsSearch, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return CompletableFuture<ListBranchesResponse>
     */
    public CompletableFuture<ListBranchesResponse> listBranchesAsync(ListBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return AsyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public AsyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesAsyncInvoker(
        ListBranchesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listBranches, hcClient);
    }

    /**
     * 批量获取用例状态
     *
     * 批量获取用例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesStatusRequest 请求对象
     * @return CompletableFuture<ListCasesStatusResponse>
     */
    public CompletableFuture<ListCasesStatusResponse> listCasesStatusAsync(ListCasesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listCasesStatus);
    }

    /**
     * 批量获取用例状态
     *
     * 批量获取用例状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCasesStatusRequest 请求对象
     * @return AsyncInvoker<ListCasesStatusRequest, ListCasesStatusResponse>
     */
    public AsyncInvoker<ListCasesStatusRequest, ListCasesStatusResponse> listCasesStatusAsyncInvoker(
        ListCasesStatusRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listCasesStatus, hcClient);
    }

    /**
     * 查询当前租户可见的第三方服务列表
     *
     * 查询当前租户可见的第三方服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainVisibleServicesRequest 请求对象
     * @return CompletableFuture<ListDomainVisibleServicesResponse>
     */
    public CompletableFuture<ListDomainVisibleServicesResponse> listDomainVisibleServicesAsync(
        ListDomainVisibleServicesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listDomainVisibleServices);
    }

    /**
     * 查询当前租户可见的第三方服务列表
     *
     * 查询当前租户可见的第三方服务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainVisibleServicesRequest 请求对象
     * @return AsyncInvoker<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse>
     */
    public AsyncInvoker<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse> listDomainVisibleServicesAsyncInvoker(
        ListDomainVisibleServicesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listDomainVisibleServices, hcClient);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return CompletableFuture<ListIssueTreeResponse>
     */
    public CompletableFuture<ListIssueTreeResponse> listIssueTreeAsync(ListIssueTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listIssueTree);
    }

    /**
     * 查询需求树
     *
     * 查询需求树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIssueTreeRequest 请求对象
     * @return AsyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse>
     */
    public AsyncInvoker<ListIssueTreeRequest, ListIssueTreeResponse> listIssueTreeAsyncInvoker(
        ListIssueTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listIssueTree, hcClient);
    }

    /**
     * 查询迭代关联的需求列表或树
     *
     * 查询迭代关联的需求列表或树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorIssueTreeRequest 请求对象
     * @return CompletableFuture<ListIteratorIssueTreeResponse>
     */
    public CompletableFuture<ListIteratorIssueTreeResponse> listIteratorIssueTreeAsync(
        ListIteratorIssueTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listIteratorIssueTree);
    }

    /**
     * 查询迭代关联的需求列表或树
     *
     * 查询迭代关联的需求列表或树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorIssueTreeRequest 请求对象
     * @return AsyncInvoker<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse>
     */
    public AsyncInvoker<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse> listIteratorIssueTreeAsyncInvoker(
        ListIteratorIssueTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listIteratorIssueTree, hcClient);
    }

    /**
     * 查询迭代计划列表，包含统计信息
     *
     * 查询迭代计划列表，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorsRequest 请求对象
     * @return CompletableFuture<ListIteratorsResponse>
     */
    public CompletableFuture<ListIteratorsResponse> listIteratorsAsync(ListIteratorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listIterators);
    }

    /**
     * 查询迭代计划列表，包含统计信息
     *
     * 查询迭代计划列表，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIteratorsRequest 请求对象
     * @return AsyncInvoker<ListIteratorsRequest, ListIteratorsResponse>
     */
    public AsyncInvoker<ListIteratorsRequest, ListIteratorsResponse> listIteratorsAsyncInvoker(
        ListIteratorsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listIterators, hcClient);
    }

    /**
     * 查询仪表盘折线图数据
     *
     * 查询仪表盘折线图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinesUsingRequest 请求对象
     * @return CompletableFuture<ListLinesUsingResponse>
     */
    public CompletableFuture<ListLinesUsingResponse> listLinesUsingAsync(ListLinesUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listLinesUsing);
    }

    /**
     * 查询仪表盘折线图数据
     *
     * 查询仪表盘折线图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLinesUsingRequest 请求对象
     * @return AsyncInvoker<ListLinesUsingRequest, ListLinesUsingResponse>
     */
    public AsyncInvoker<ListLinesUsingRequest, ListLinesUsingResponse> listLinesUsingAsyncInvoker(
        ListLinesUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listLinesUsing, hcClient);
    }

    /**
     * 仪表盘根据测试服务ID获取MsgInfo详细信息
     *
     * 成功返回MsgInfo的详细信息列表，返回值为Model的List
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMsgInfosUsingRequest 请求对象
     * @return CompletableFuture<ListMsgInfosUsingResponse>
     */
    public CompletableFuture<ListMsgInfosUsingResponse> listMsgInfosUsingAsync(ListMsgInfosUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listMsgInfosUsing);
    }

    /**
     * 仪表盘根据测试服务ID获取MsgInfo详细信息
     *
     * 成功返回MsgInfo的详细信息列表，返回值为Model的List
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMsgInfosUsingRequest 请求对象
     * @return AsyncInvoker<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse>
     */
    public AsyncInvoker<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse> listMsgInfosUsingAsyncInvoker(
        ListMsgInfosUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listMsgInfosUsing, hcClient);
    }

    /**
     * 获取责任人是自己的测试用例
     *
     * 获取责任人是自己的测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOwnTestCasesRequest 请求对象
     * @return CompletableFuture<ListOwnTestCasesResponse>
     */
    public CompletableFuture<ListOwnTestCasesResponse> listOwnTestCasesAsync(ListOwnTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listOwnTestCases);
    }

    /**
     * 获取责任人是自己的测试用例
     *
     * 获取责任人是自己的测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOwnTestCasesRequest 请求对象
     * @return AsyncInvoker<ListOwnTestCasesRequest, ListOwnTestCasesResponse>
     */
    public AsyncInvoker<ListOwnTestCasesRequest, ListOwnTestCasesResponse> listOwnTestCasesAsyncInvoker(
        ListOwnTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listOwnTestCases, hcClient);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return CompletableFuture<ListProjectFieldConfigsResponse>
     */
    public CompletableFuture<ListProjectFieldConfigsResponse> listProjectFieldConfigsAsync(
        ListProjectFieldConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listProjectFieldConfigs);
    }

    /**
     * 查询项目字段配置
     *
     * 查询项目字段配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectFieldConfigsRequest 请求对象
     * @return AsyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse>
     */
    public AsyncInvoker<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> listProjectFieldConfigsAsyncInvoker(
        ListProjectFieldConfigsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listProjectFieldConfigs, hcClient);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return CompletableFuture<ListProjectTestCaseFieldsResponse>
     */
    public CompletableFuture<ListProjectTestCaseFieldsResponse> listProjectTestCaseFieldsAsync(
        ListProjectTestCaseFieldsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listProjectTestCaseFields);
    }

    /**
     * 获取项目测试用例自定义字段列表
     *
     * 获取项目测试用例自定义字段列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTestCaseFieldsRequest 请求对象
     * @return AsyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse>
     */
    public AsyncInvoker<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> listProjectTestCaseFieldsAsyncInvoker(
        ListProjectTestCaseFieldsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listProjectTestCaseFields, hcClient);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return CompletableFuture<ListPublicLibAndAwsResponse>
     */
    public CompletableFuture<ListPublicLibAndAwsResponse> listPublicLibAndAwsAsync(ListPublicLibAndAwsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listPublicLibAndAws);
    }

    /**
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     *
     * 获取工程关联的公共aw信息和公共aw所属公共aw库信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicLibAndAwsRequest 请求对象
     * @return AsyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse>
     */
    public AsyncInvoker<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> listPublicLibAndAwsAsyncInvoker(
        ListPublicLibAndAwsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listPublicLibAndAws, hcClient);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return CompletableFuture<ListReportsResponse>
     */
    public CompletableFuture<ListReportsResponse> listReportsAsync(ListReportsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listReports);
    }

    /**
     * 页面报表展示
     *
     * 页面报表展示
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReportsRequest 请求对象
     * @return AsyncInvoker<ListReportsRequest, ListReportsResponse>
     */
    public AsyncInvoker<ListReportsRequest, ListReportsResponse> listReportsAsyncInvoker(ListReportsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listReports, hcClient);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return CompletableFuture<ListResourcePoolsResponse>
     */
    public CompletableFuture<ListResourcePoolsResponse> listResourcePoolsAsync(ListResourcePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listResourcePools);
    }

    /**
     * 获取资源池列表
     *
     * 获取资源池列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourcePoolsRequest 请求对象
     * @return AsyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse>
     */
    public AsyncInvoker<ListResourcePoolsRequest, ListResourcePoolsResponse> listResourcePoolsAsyncInvoker(
        ListResourcePoolsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listResourcePools, hcClient);
    }

    /**
     * 查询仪表盘散点图数据
     *
     * 查询仪表盘散点图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScattersUsingRequest 请求对象
     * @return CompletableFuture<ListScattersUsingResponse>
     */
    public CompletableFuture<ListScattersUsingResponse> listScattersUsingAsync(ListScattersUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listScattersUsing);
    }

    /**
     * 查询仪表盘散点图数据
     *
     * 查询仪表盘散点图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScattersUsingRequest 请求对象
     * @return AsyncInvoker<ListScattersUsingRequest, ListScattersUsingResponse>
     */
    public AsyncInvoker<ListScattersUsingRequest, ListScattersUsingResponse> listScattersUsingAsyncInvoker(
        ListScattersUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listScattersUsing, hcClient);
    }

    /**
     * 查询subTestCase阻塞任务数据
     *
     * 成功返回子任务用例数据积压信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTaskCaseOverstockUsingRequest 请求对象
     * @return CompletableFuture<ListSubTaskCaseOverstockUsingResponse>
     */
    public CompletableFuture<ListSubTaskCaseOverstockUsingResponse> listSubTaskCaseOverstockUsingAsync(
        ListSubTaskCaseOverstockUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listSubTaskCaseOverstockUsing);
    }

    /**
     * 查询subTestCase阻塞任务数据
     *
     * 成功返回子任务用例数据积压信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubTaskCaseOverstockUsingRequest 请求对象
     * @return AsyncInvoker<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse>
     */
    public AsyncInvoker<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse> listSubTaskCaseOverstockUsingAsyncInvoker(
        ListSubTaskCaseOverstockUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listSubTaskCaseOverstockUsing, hcClient);
    }

    /**
     * 获取测试套关联用例详情
     *
     * 获取测试套关联用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskAssignCasesRequest 请求对象
     * @return CompletableFuture<ListTaskAssignCasesResponse>
     */
    public CompletableFuture<ListTaskAssignCasesResponse> listTaskAssignCasesAsync(ListTaskAssignCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTaskAssignCases);
    }

    /**
     * 获取测试套关联用例详情
     *
     * 获取测试套关联用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskAssignCasesRequest 请求对象
     * @return AsyncInvoker<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse>
     */
    public AsyncInvoker<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse> listTaskAssignCasesAsyncInvoker(
        ListTaskAssignCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTaskAssignCases, hcClient);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return CompletableFuture<ListTaskTestCasesResponse>
     */
    public CompletableFuture<ListTaskTestCasesResponse> listTaskTestCasesAsync(ListTaskTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTaskTestCases);
    }

    /**
     * 查询用例关联的测试任务列表
     *
     * 查询用例关联的测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTaskTestCasesRequest 请求对象
     * @return AsyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse>
     */
    public AsyncInvoker<ListTaskTestCasesRequest, ListTaskTestCasesResponse> listTaskTestCasesAsyncInvoker(
        ListTaskTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTaskTestCases, hcClient);
    }

    /**
     * 查询测试任务列表
     *
     * 查询测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTasks);
    }

    /**
     * 查询测试任务列表
     *
     * 查询测试任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTasks, hcClient);
    }

    /**
     * 查询用例评论
     *
     * 查询用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseCommentsRequest 请求对象
     * @return CompletableFuture<ListTestCaseCommentsResponse>
     */
    public CompletableFuture<ListTestCaseCommentsResponse> listTestCaseCommentsAsync(
        ListTestCaseCommentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCaseComments);
    }

    /**
     * 查询用例评论
     *
     * 查询用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseCommentsRequest 请求对象
     * @return AsyncInvoker<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse>
     */
    public AsyncInvoker<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse> listTestCaseCommentsAsyncInvoker(
        ListTestCaseCommentsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCaseComments, hcClient);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return CompletableFuture<ListTestCaseHistoriesResponse>
     */
    public CompletableFuture<ListTestCaseHistoriesResponse> listTestCaseHistoriesAsync(
        ListTestCaseHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCaseHistories);
    }

    /**
     * 查询用例修改历史记录
     *
     * 查询用例修改历史记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseHistoriesRequest 请求对象
     * @return AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse>
     */
    public AsyncInvoker<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistoriesAsyncInvoker(
        ListTestCaseHistoriesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCaseHistories, hcClient);
    }

    /**
     * 获取用例脚本详细信息
     *
     * 获取用例脚本详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseScriptDetailRequest 请求对象
     * @return CompletableFuture<ListTestCaseScriptDetailResponse>
     */
    public CompletableFuture<ListTestCaseScriptDetailResponse> listTestCaseScriptDetailAsync(
        ListTestCaseScriptDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCaseScriptDetail);
    }

    /**
     * 获取用例脚本详细信息
     *
     * 获取用例脚本详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCaseScriptDetailRequest 请求对象
     * @return AsyncInvoker<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse>
     */
    public AsyncInvoker<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse> listTestCaseScriptDetailAsyncInvoker(
        ListTestCaseScriptDetailRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCaseScriptDetail, hcClient);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return CompletableFuture<ListTestCasesResponse>
     */
    public CompletableFuture<ListTestCasesResponse> listTestCasesAsync(ListTestCasesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCases);
    }

    /**
     * 查询用例列表
     *
     * 查询用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesRequest 请求对象
     * @return AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse>
     */
    public AsyncInvoker<ListTestCasesRequest, ListTestCasesResponse> listTestCasesAsyncInvoker(
        ListTestCasesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCases, hcClient);
    }

    /**
     * 查询需求下的用例列表
     *
     * 查询需求下的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesByIssueRequest 请求对象
     * @return CompletableFuture<ListTestCasesByIssueResponse>
     */
    public CompletableFuture<ListTestCasesByIssueResponse> listTestCasesByIssueAsync(
        ListTestCasesByIssueRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestCasesByIssue);
    }

    /**
     * 查询需求下的用例列表
     *
     * 查询需求下的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestCasesByIssueRequest 请求对象
     * @return AsyncInvoker<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse>
     */
    public AsyncInvoker<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse> listTestCasesByIssueAsyncInvoker(
        ListTestCasesByIssueRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestCasesByIssue, hcClient);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return CompletableFuture<ListTestReportsByConditionResponse>
     */
    public CompletableFuture<ListTestReportsByConditionResponse> listTestReportsByConditionAsync(
        ListTestReportsByConditionRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestReportsByCondition);
    }

    /**
     * 根据查询条件获取测试报告列表
     *
     * 根据查询条件获取测试报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestReportsByConditionRequest 请求对象
     * @return AsyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse>
     */
    public AsyncInvoker<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> listTestReportsByConditionAsyncInvoker(
        ListTestReportsByConditionRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestReportsByCondition, hcClient);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return CompletableFuture<ListTestTypesResponse>
     */
    public CompletableFuture<ListTestTypesResponse> listTestTypesAsync(ListTestTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestTypes);
    }

    /**
     * 获取测试类型列表
     *
     * 获取测试类型列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestTypesRequest 请求对象
     * @return AsyncInvoker<ListTestTypesRequest, ListTestTypesResponse>
     */
    public AsyncInvoker<ListTestTypesRequest, ListTestTypesResponse> listTestTypesAsyncInvoker(
        ListTestTypesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestTypes, hcClient);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return CompletableFuture<ListTestcasesByProjectIssuesRelationResponse>
     */
    public CompletableFuture<ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelationAsync(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestcasesByProjectIssuesRelation);
    }

    /**
     * 查询项目下关联了需求的用例列表
     *
     * 查询项目下关联了需求的用例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasesByProjectIssuesRelationRequest 请求对象
     * @return AsyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse>
     */
    public AsyncInvoker<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelationAsyncInvoker(
        ListTestcasesByProjectIssuesRelationRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestcasesByProjectIssuesRelation, hcClient);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return CompletableFuture<ListUsageInfosResponse>
     */
    public CompletableFuture<ListUsageInfosResponse> listUsageInfosAsync(ListUsageInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUsageInfos);
    }

    /**
     * 获取租户订单已用资源信息
     *
     * 获取租户订单已用资源信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsageInfosRequest 请求对象
     * @return AsyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse>
     */
    public AsyncInvoker<ListUsageInfosRequest, ListUsageInfosResponse> listUsageInfosAsyncInvoker(
        ListUsageInfosRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUsageInfos, hcClient);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return CompletableFuture<ListUserDnsMappingResponse>
     */
    public CompletableFuture<ListUserDnsMappingResponse> listUserDnsMappingAsync(ListUserDnsMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUserDnsMapping);
    }

    /**
     * 查询用户DNS映射
     *
     * 查询用户DNS映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserDnsMappingRequest 请求对象
     * @return AsyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse>
     */
    public AsyncInvoker<ListUserDnsMappingRequest, ListUserDnsMappingResponse> listUserDnsMappingAsyncInvoker(
        ListUserDnsMappingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUserDnsMapping, hcClient);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return CompletableFuture<ListUserPackageUsageResponse>
     */
    public CompletableFuture<ListUserPackageUsageResponse> listUserPackageUsageAsync(
        ListUserPackageUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUserPackageUsage);
    }

    /**
     * ListUserPackageUsage
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPackageUsageRequest 请求对象
     * @return AsyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse>
     */
    public AsyncInvoker<ListUserPackageUsageRequest, ListUserPackageUsageResponse> listUserPackageUsageAsyncInvoker(
        ListUserPackageUsageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUserPackageUsage, hcClient);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return CompletableFuture<ListUserPopupInfoResponse>
     */
    public CompletableFuture<ListUserPopupInfoResponse> listUserPopupInfoAsync(ListUserPopupInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUserPopupInfo);
    }

    /**
     * ListUserPopupInfo
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserPopupInfoRequest 请求对象
     * @return AsyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse>
     */
    public AsyncInvoker<ListUserPopupInfoRequest, ListUserPopupInfoResponse> listUserPopupInfoAsyncInvoker(
        ListUserPopupInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUserPopupInfo, hcClient);
    }

    /**
     * 查询仪表盘用户的看板
     *
     * 查询仪表盘用户的看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingGetRequest 请求对象
     * @return CompletableFuture<ListUsingGetResponse>
     */
    public CompletableFuture<ListUsingGetResponse> listUsingGetAsync(ListUsingGetRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listUsingGet);
    }

    /**
     * 查询仪表盘用户的看板
     *
     * 查询仪表盘用户的看板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingGetRequest 请求对象
     * @return AsyncInvoker<ListUsingGetRequest, ListUsingGetResponse>
     */
    public AsyncInvoker<ListUsingGetRequest, ListUsingGetResponse> listUsingGetAsyncInvoker(
        ListUsingGetRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listUsingGet, hcClient);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return CompletableFuture<ListVariablesResponse>
     */
    public CompletableFuture<ListVariablesResponse> listVariablesAsync(ListVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listVariables);
    }

    /**
     * 查询全局变量参数列表V4
     *
     * 查询全局变量参数列表V4
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListVariablesRequest 请求对象
     * @return AsyncInvoker<ListVariablesRequest, ListVariablesResponse>
     */
    public AsyncInvoker<ListVariablesRequest, ListVariablesResponse> listVariablesAsyncInvoker(
        ListVariablesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listVariables, hcClient);
    }

    /**
     * 从迭代中移除需求
     *
     * 从迭代中移除需求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIssuesFromIteratorRequest 请求对象
     * @return CompletableFuture<RemoveIssuesFromIteratorResponse>
     */
    public CompletableFuture<RemoveIssuesFromIteratorResponse> removeIssuesFromIteratorAsync(
        RemoveIssuesFromIteratorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.removeIssuesFromIterator);
    }

    /**
     * 从迭代中移除需求
     *
     * 从迭代中移除需求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveIssuesFromIteratorRequest 请求对象
     * @return AsyncInvoker<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse>
     */
    public AsyncInvoker<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse> removeIssuesFromIteratorAsyncInvoker(
        RemoveIssuesFromIteratorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.removeIssuesFromIterator, hcClient);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return CompletableFuture<RunTestCaseResponse>
     */
    public CompletableFuture<RunTestCaseResponse> runTestCaseAsync(RunTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.runTestCase);
    }

    /**
     * 批量执行测试用例
     *
     * 批量执行测试用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunTestCaseRequest 请求对象
     * @return AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse>
     */
    public AsyncInvoker<RunTestCaseRequest, RunTestCaseResponse> runTestCaseAsyncInvoker(RunTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.runTestCase, hcClient);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return CompletableFuture<SaveTaskSettingResponse>
     */
    public CompletableFuture<SaveTaskSettingResponse> saveTaskSettingAsync(SaveTaskSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.saveTaskSetting);
    }

    /**
     * 保存任务配置
     *
     * 保存任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveTaskSettingRequest 请求对象
     * @return AsyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse>
     */
    public AsyncInvoker<SaveTaskSettingRequest, SaveTaskSettingResponse> saveTaskSettingAsyncInvoker(
        SaveTaskSettingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.saveTaskSetting, hcClient);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return CompletableFuture<ShowAllConfigValueByTypeAndKeyResponse>
     */
    public CompletableFuture<ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKeyAsync(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showAllConfigValueByTypeAndKey);
    }

    /**
     * 查询任务配置
     *
     * 查询任务配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllConfigValueByTypeAndKeyRequest 请求对象
     * @return AsyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse>
     */
    public AsyncInvoker<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKeyAsyncInvoker(
        ShowAllConfigValueByTypeAndKeyRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showAllConfigValueByTypeAndKey, hcClient);
    }

    /**
     * 获取特性树V5
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return CompletableFuture<ShowAllFeatureChildrenResponse>
     */
    public CompletableFuture<ShowAllFeatureChildrenResponse> showAllFeatureChildrenAsync(
        ShowAllFeatureChildrenRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showAllFeatureChildren);
    }

    /**
     * 获取特性树V5
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllFeatureChildrenRequest 请求对象
     * @return AsyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse>
     */
    public AsyncInvoker<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> showAllFeatureChildrenAsyncInvoker(
        ShowAllFeatureChildrenRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showAllFeatureChildren, hcClient);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return CompletableFuture<ShowApiTestcaseHistoriesResponse>
     */
    public CompletableFuture<ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesAsync(
        ShowApiTestcaseHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showApiTestcaseHistories);
    }

    /**
     * 获取用例历史执行数据
     *
     * 获取用例历史执行数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiTestcaseHistoriesRequest 请求对象
     * @return AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse>
     */
    public AsyncInvoker<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistoriesAsyncInvoker(
        ShowApiTestcaseHistoriesRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showApiTestcaseHistories, hcClient);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return CompletableFuture<ShowAssetResponse>
     */
    public CompletableFuture<ShowAssetResponse> showAssetAsync(ShowAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showAsset);
    }

    /**
     * 获取资产列表
     *
     * 获取资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetRequest 请求对象
     * @return AsyncInvoker<ShowAssetRequest, ShowAssetResponse>
     */
    public AsyncInvoker<ShowAssetRequest, ShowAssetResponse> showAssetAsyncInvoker(ShowAssetRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showAsset, hcClient);
    }

    /**
     * 获取资产树列表
     *
     * 获取资产树列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetTreeRequest 请求对象
     * @return CompletableFuture<ShowAssetTreeResponse>
     */
    public CompletableFuture<ShowAssetTreeResponse> showAssetTreeAsync(ShowAssetTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showAssetTree);
    }

    /**
     * 获取资产树列表
     *
     * 获取资产树列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssetTreeRequest 请求对象
     * @return AsyncInvoker<ShowAssetTreeRequest, ShowAssetTreeResponse>
     */
    public AsyncInvoker<ShowAssetTreeRequest, ShowAssetTreeResponse> showAssetTreeAsyncInvoker(
        ShowAssetTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showAssetTree, hcClient);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return CompletableFuture<ShowBackgroundInfoResponse>
     */
    public CompletableFuture<ShowBackgroundInfoResponse> showBackgroundInfoAsync(ShowBackgroundInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showBackgroundInfo);
    }

    /**
     * 获取测试报告的模板设置
     *
     * 获取测试报告的模板设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundInfoRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse>
     */
    public AsyncInvoker<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> showBackgroundInfoAsyncInvoker(
        ShowBackgroundInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showBackgroundInfo, hcClient);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return CompletableFuture<ShowBranchResponse>
     */
    public CompletableFuture<ShowBranchResponse> showBranchAsync(ShowBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showBranch);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return AsyncInvoker<ShowBranchRequest, ShowBranchResponse>
     */
    public AsyncInvoker<ShowBranchRequest, ShowBranchResponse> showBranchAsyncInvoker(ShowBranchRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showBranch, hcClient);
    }

    /**
     * 查询用例结果
     *
     * 查询用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseResultRequest 请求对象
     * @return CompletableFuture<ShowCaseResultResponse>
     */
    public CompletableFuture<ShowCaseResultResponse> showCaseResultAsync(ShowCaseResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showCaseResult);
    }

    /**
     * 查询用例结果
     *
     * 查询用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCaseResultRequest 请求对象
     * @return AsyncInvoker<ShowCaseResultRequest, ShowCaseResultResponse>
     */
    public AsyncInvoker<ShowCaseResultRequest, ShowCaseResultResponse> showCaseResultAsyncInvoker(
        ShowCaseResultRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showCaseResult, hcClient);
    }

    /**
     * 查询租户测试并发套餐状态
     *
     * 查询租户测试并发套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConcurrencyPackageUsingRequest 请求对象
     * @return CompletableFuture<ShowConcurrencyPackageUsingResponse>
     */
    public CompletableFuture<ShowConcurrencyPackageUsingResponse> showConcurrencyPackageUsingAsync(
        ShowConcurrencyPackageUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showConcurrencyPackageUsing);
    }

    /**
     * 查询租户测试并发套餐状态
     *
     * 查询租户测试并发套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConcurrencyPackageUsingRequest 请求对象
     * @return AsyncInvoker<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse>
     */
    public AsyncInvoker<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse> showConcurrencyPackageUsingAsyncInvoker(
        ShowConcurrencyPackageUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showConcurrencyPackageUsing, hcClient);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return CompletableFuture<ShowDisclaimerRecordResponse>
     */
    public CompletableFuture<ShowDisclaimerRecordResponse> showDisclaimerRecordAsync(
        ShowDisclaimerRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showDisclaimerRecord);
    }

    /**
     * 查询用户免责声明
     *
     * 查询用户免责声明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisclaimerRecordRequest 请求对象
     * @return AsyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse>
     */
    public AsyncInvoker<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> showDisclaimerRecordAsyncInvoker(
        ShowDisclaimerRecordRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showDisclaimerRecord, hcClient);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return CompletableFuture<ShowDomainInfoResponse>
     */
    public CompletableFuture<ShowDomainInfoResponse> showDomainInfoAsync(ShowDomainInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showDomainInfo);
    }

    /**
     * 根据domainId获取加密的testbirdkey
     *
     * 根据domainId获取加密的testbirdkey
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainInfoRequest 请求对象
     * @return AsyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse>
     */
    public AsyncInvoker<ShowDomainInfoRequest, ShowDomainInfoResponse> showDomainInfoAsyncInvoker(
        ShowDomainInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showDomainInfo, hcClient);
    }

    /**
     * 查询租户在线拨测套餐状态
     *
     * 查询租户在线拨测套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEchoTestPackageUsingRequest 请求对象
     * @return CompletableFuture<ShowEchoTestPackageUsingResponse>
     */
    public CompletableFuture<ShowEchoTestPackageUsingResponse> showEchoTestPackageUsingAsync(
        ShowEchoTestPackageUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showEchoTestPackageUsing);
    }

    /**
     * 查询租户在线拨测套餐状态
     *
     * 查询租户在线拨测套餐状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEchoTestPackageUsingRequest 请求对象
     * @return AsyncInvoker<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse>
     */
    public AsyncInvoker<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse> showEchoTestPackageUsingAsyncInvoker(
        ShowEchoTestPackageUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showEchoTestPackageUsing, hcClient);
    }

    /**
     * 根据目录查询因子
     *
     * 根据目录查询因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByAssetIdRequest 请求对象
     * @return CompletableFuture<ShowFactorByAssetIdResponse>
     */
    public CompletableFuture<ShowFactorByAssetIdResponse> showFactorByAssetIdAsync(ShowFactorByAssetIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showFactorByAssetId);
    }

    /**
     * 根据目录查询因子
     *
     * 根据目录查询因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByAssetIdRequest 请求对象
     * @return AsyncInvoker<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse>
     */
    public AsyncInvoker<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse> showFactorByAssetIdAsyncInvoker(
        ShowFactorByAssetIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showFactorByAssetId, hcClient);
    }

    /**
     * 根据id获取因子
     *
     * 根据id获取因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByIdRequest 请求对象
     * @return CompletableFuture<ShowFactorByIdResponse>
     */
    public CompletableFuture<ShowFactorByIdResponse> showFactorByIdAsync(ShowFactorByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showFactorById);
    }

    /**
     * 根据id获取因子
     *
     * 根据id获取因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFactorByIdRequest 请求对象
     * @return AsyncInvoker<ShowFactorByIdRequest, ShowFactorByIdResponse>
     */
    public AsyncInvoker<ShowFactorByIdRequest, ShowFactorByIdResponse> showFactorByIdAsyncInvoker(
        ShowFactorByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showFactorById, hcClient);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return CompletableFuture<ShowFeatureChildrenResponse>
     */
    public CompletableFuture<ShowFeatureChildrenResponse> showFeatureChildrenAsync(ShowFeatureChildrenRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showFeatureChildren);
    }

    /**
     * 获取目录\\特性树
     *
     * 获取目录\\特性树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFeatureChildrenRequest 请求对象
     * @return AsyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse>
     */
    public AsyncInvoker<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> showFeatureChildrenAsyncInvoker(
        ShowFeatureChildrenRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showFeatureChildren, hcClient);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return CompletableFuture<ShowFreeDeclarationResponse>
     */
    public CompletableFuture<ShowFreeDeclarationResponse> showFreeDeclarationAsync(ShowFreeDeclarationRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showFreeDeclaration);
    }

    /**
     * 查询限时免费用户免责声明记录
     *
     * 查询限时免费用户免责声明记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFreeDeclarationRequest 请求对象
     * @return AsyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse>
     */
    public AsyncInvoker<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> showFreeDeclarationAsyncInvoker(
        ShowFreeDeclarationRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showFreeDeclaration, hcClient);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return CompletableFuture<ShowIfTaskNameRepeatResponse>
     */
    public CompletableFuture<ShowIfTaskNameRepeatResponse> showIfTaskNameRepeatAsync(
        ShowIfTaskNameRepeatRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIfTaskNameRepeat);
    }

    /**
     * 查询告警模板名称是否重复
     *
     * 查询告警模板名称是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfTaskNameRepeatRequest 请求对象
     * @return AsyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse>
     */
    public AsyncInvoker<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> showIfTaskNameRepeatAsyncInvoker(
        ShowIfTaskNameRepeatRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIfTaskNameRepeat, hcClient);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return CompletableFuture<ShowIfUserNameRepeatResponse>
     */
    public CompletableFuture<ShowIfUserNameRepeatResponse> showIfUserNameRepeatAsync(
        ShowIfUserNameRepeatRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIfUserNameRepeat);
    }

    /**
     * 查询告警组用户名是否重复
     *
     * 查询告警组用户名是否重复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIfUserNameRepeatRequest 请求对象
     * @return AsyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse>
     */
    public AsyncInvoker<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> showIfUserNameRepeatAsyncInvoker(
        ShowIfUserNameRepeatRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIfUserNameRepeat, hcClient);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return CompletableFuture<ShowIssuesByPlanIdResponse>
     */
    public CompletableFuture<ShowIssuesByPlanIdResponse> showIssuesByPlanIdAsync(ShowIssuesByPlanIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIssuesByPlanId);
    }

    /**
     * 查询某个测试计划下的需求树
     *
     * 查询某个测试计划下的需求列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIssuesByPlanIdRequest 请求对象
     * @return AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse>
     */
    public AsyncInvoker<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanIdAsyncInvoker(
        ShowIssuesByPlanIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIssuesByPlanId, hcClient);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return CompletableFuture<ShowIteratorByDefectResponse>
     */
    public CompletableFuture<ShowIteratorByDefectResponse> showIteratorByDefectAsync(
        ShowIteratorByDefectRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIteratorByDefect);
    }

    /**
     * 查询缺陷相关联测试计划
     *
     * 查询缺陷相关联测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorByDefectRequest 请求对象
     * @return AsyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse>
     */
    public AsyncInvoker<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> showIteratorByDefectAsyncInvoker(
        ShowIteratorByDefectRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIteratorByDefect, hcClient);
    }

    /**
     * 查询迭代计划详情，包含统计信息
     *
     * 查询迭代计划详情，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorDetailRequest 请求对象
     * @return CompletableFuture<ShowIteratorDetailResponse>
     */
    public CompletableFuture<ShowIteratorDetailResponse> showIteratorDetailAsync(ShowIteratorDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showIteratorDetail);
    }

    /**
     * 查询迭代计划详情，包含统计信息
     *
     * 查询迭代计划详情，包含统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIteratorDetailRequest 请求对象
     * @return AsyncInvoker<ShowIteratorDetailRequest, ShowIteratorDetailResponse>
     */
    public AsyncInvoker<ShowIteratorDetailRequest, ShowIteratorDetailResponse> showIteratorDetailAsyncInvoker(
        ShowIteratorDetailRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showIteratorDetail, hcClient);
    }

    /**
     * 根据id获取脑图对象
     *
     * 根据id获取脑图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindMapByIdRequest 请求对象
     * @return CompletableFuture<ShowMindMapByIdResponse>
     */
    public CompletableFuture<ShowMindMapByIdResponse> showMindMapByIdAsync(ShowMindMapByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindMapById);
    }

    /**
     * 根据id获取脑图对象
     *
     * 根据id获取脑图对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindMapByIdRequest 请求对象
     * @return AsyncInvoker<ShowMindMapByIdRequest, ShowMindMapByIdResponse>
     */
    public AsyncInvoker<ShowMindMapByIdRequest, ShowMindMapByIdResponse> showMindMapByIdAsyncInvoker(
        ShowMindMapByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindMapById, hcClient);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return CompletableFuture<ShowMindmapByPageResponse>
     */
    public CompletableFuture<ShowMindmapByPageResponse> showMindmapByPageAsync(ShowMindmapByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapByPage);
    }

    /**
     * 根据条件分页获取脑图对象V3
     *
     * 根据条件分页获取脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapByPageRequest 请求对象
     * @return AsyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse>
     */
    public AsyncInvoker<ShowMindmapByPageRequest, ShowMindmapByPageResponse> showMindmapByPageAsyncInvoker(
        ShowMindmapByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapByPage, hcClient);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return CompletableFuture<ShowMindmapCreatorNameResponse>
     */
    public CompletableFuture<ShowMindmapCreatorNameResponse> showMindmapCreatorNameAsync(
        ShowMindmapCreatorNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapCreatorName);
    }

    /**
     * 获取脑图创建人V2
     *
     * 获取脑图创建人V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapCreatorNameRequest 请求对象
     * @return AsyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse>
     */
    public AsyncInvoker<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> showMindmapCreatorNameAsyncInvoker(
        ShowMindmapCreatorNameRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapCreatorName, hcClient);
    }

    /**
     * 查询运行面板信息
     *
     * 成功返回运行面板信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationalDataCurrentMonthUsingRequest 请求对象
     * @return CompletableFuture<ShowOperationalDataCurrentMonthUsingResponse>
     */
    public CompletableFuture<ShowOperationalDataCurrentMonthUsingResponse> showOperationalDataCurrentMonthUsingAsync(
        ShowOperationalDataCurrentMonthUsingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showOperationalDataCurrentMonthUsing);
    }

    /**
     * 查询运行面板信息
     *
     * 成功返回运行面板信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOperationalDataCurrentMonthUsingRequest 请求对象
     * @return AsyncInvoker<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse>
     */
    public AsyncInvoker<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse> showOperationalDataCurrentMonthUsingAsyncInvoker(
        ShowOperationalDataCurrentMonthUsingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showOperationalDataCurrentMonthUsing, hcClient);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return CompletableFuture<ShowPlanJournalsResponse>
     */
    public CompletableFuture<ShowPlanJournalsResponse> showPlanJournalsAsync(ShowPlanJournalsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlanJournals);
    }

    /**
     * 查询某测试计划下的操作历史
     *
     * 查询某测试计划下的操作历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanJournalsRequest 请求对象
     * @return AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse>
     */
    public AsyncInvoker<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournalsAsyncInvoker(
        ShowPlanJournalsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showPlanJournals, hcClient);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return CompletableFuture<ShowPlanListResponse>
     */
    public CompletableFuture<ShowPlanListResponse> showPlanListAsync(ShowPlanListRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlanList);
    }

    /**
     * 项目下查询测试计划列表v2
     *
     * 项目下查询测试计划列表v2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlanListRequest 请求对象
     * @return AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse>
     */
    public AsyncInvoker<ShowPlanListRequest, ShowPlanListResponse> showPlanListAsyncInvoker(
        ShowPlanListRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showPlanList, hcClient);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return CompletableFuture<ShowPlansResponse>
     */
    public CompletableFuture<ShowPlansResponse> showPlansAsync(ShowPlansRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showPlans);
    }

    /**
     * 项目下查询测试计划列表
     *
     * 项目下查询测试计划列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPlansRequest 请求对象
     * @return AsyncInvoker<ShowPlansRequest, ShowPlansResponse>
     */
    public AsyncInvoker<ShowPlansRequest, ShowPlansResponse> showPlansAsyncInvoker(ShowPlansRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showPlans, hcClient);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return CompletableFuture<ShowProgressResponse>
     */
    public CompletableFuture<ShowProgressResponse> showProgressAsync(ShowProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showProgress);
    }

    /**
     * 获取异步进度
     *
     * 获取异步进度
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProgressRequest 请求对象
     * @return AsyncInvoker<ShowProgressRequest, ShowProgressResponse>
     */
    public AsyncInvoker<ShowProgressRequest, ShowProgressResponse> showProgressAsyncInvoker(
        ShowProgressRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showProgress, hcClient);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return CompletableFuture<ShowProjectDataDashboardResponse>
     */
    public CompletableFuture<ShowProjectDataDashboardResponse> showProjectDataDashboardAsync(
        ShowProjectDataDashboardRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showProjectDataDashboard);
    }

    /**
     * 查询质量报告看板统计信息
     *
     * 查询质量报告看板统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectDataDashboardRequest 请求对象
     * @return AsyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse>
     */
    public AsyncInvoker<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> showProjectDataDashboardAsyncInvoker(
        ShowProjectDataDashboardRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showProjectDataDashboard, hcClient);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return CompletableFuture<ShowRegisterServiceResponse>
     */
    public CompletableFuture<ShowRegisterServiceResponse> showRegisterServiceAsync(ShowRegisterServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRegisterService);
    }

    /**
     * 用户获取自己当前已经注册的服务
     *
     * 用户获取自己当前已经注册的服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRegisterServiceRequest 请求对象
     * @return AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse>
     */
    public AsyncInvoker<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterServiceAsyncInvoker(
        ShowRegisterServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showRegisterService, hcClient);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return CompletableFuture<ShowReportResponse>
     */
    public CompletableFuture<ShowReportResponse> showReportAsync(ShowReportRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showReport);
    }

    /**
     * 实时计算单个自定义报表
     *
     * 实时计算单个自定义报表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReportRequest 请求对象
     * @return AsyncInvoker<ShowReportRequest, ShowReportResponse>
     */
    public AsyncInvoker<ShowReportRequest, ShowReportResponse> showReportAsyncInvoker(ShowReportRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showReport, hcClient);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return CompletableFuture<ShowRequirementsOverviewResponse>
     */
    public CompletableFuture<ShowRequirementsOverviewResponse> showRequirementsOverviewAsync(
        ShowRequirementsOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showRequirementsOverview);
    }

    /**
     * 质量报告需求测试情况统计
     *
     * 质量报告需求测试情况统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRequirementsOverviewRequest 请求对象
     * @return AsyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse>
     */
    public AsyncInvoker<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> showRequirementsOverviewAsyncInvoker(
        ShowRequirementsOverviewRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showRequirementsOverview, hcClient);
    }

    /**
     * 根据条件分页获取评审对象V2
     *
     * 根据条件分页获取评审对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewByPageRequest 请求对象
     * @return CompletableFuture<ShowReviewByPageResponse>
     */
    public CompletableFuture<ShowReviewByPageResponse> showReviewByPageAsync(ShowReviewByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showReviewByPage);
    }

    /**
     * 根据条件分页获取评审对象V2
     *
     * 根据条件分页获取评审对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewByPageRequest 请求对象
     * @return AsyncInvoker<ShowReviewByPageRequest, ShowReviewByPageResponse>
     */
    public AsyncInvoker<ShowReviewByPageRequest, ShowReviewByPageResponse> showReviewByPageAsyncInvoker(
        ShowReviewByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showReviewByPage, hcClient);
    }

    /**
     * 根据条件分页获取场景对象V2
     *
     * 根据条件分页获取场景对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSceneByPageRequest 请求对象
     * @return CompletableFuture<ShowSceneByPageResponse>
     */
    public CompletableFuture<ShowSceneByPageResponse> showSceneByPageAsync(ShowSceneByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showSceneByPage);
    }

    /**
     * 根据条件分页获取场景对象V2
     *
     * 根据条件分页获取场景对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSceneByPageRequest 请求对象
     * @return AsyncInvoker<ShowSceneByPageRequest, ShowSceneByPageResponse>
     */
    public AsyncInvoker<ShowSceneByPageRequest, ShowSceneByPageResponse> showSceneByPageAsyncInvoker(
        ShowSceneByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showSceneByPage, hcClient);
    }

    /**
     * 根据脑图id查询统计数目
     *
     * 根据脑图id查询统计数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticByIdRequest 请求对象
     * @return CompletableFuture<ShowStatisticByIdResponse>
     */
    public CompletableFuture<ShowStatisticByIdResponse> showStatisticByIdAsync(ShowStatisticByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showStatisticById);
    }

    /**
     * 根据脑图id查询统计数目
     *
     * 根据脑图id查询统计数目
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatisticByIdRequest 请求对象
     * @return AsyncInvoker<ShowStatisticByIdRequest, ShowStatisticByIdResponse>
     */
    public AsyncInvoker<ShowStatisticByIdRequest, ShowStatisticByIdResponse> showStatisticByIdAsyncInvoker(
        ShowStatisticByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showStatisticById, hcClient);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return CompletableFuture<ShowSystemConfigsResponse>
     */
    public CompletableFuture<ShowSystemConfigsResponse> showSystemConfigsAsync(ShowSystemConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showSystemConfigs);
    }

    /**
     * 根据入参动态查询系统配置中的信息
     *
     * 根据入参动态查询系统配置中的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSystemConfigsRequest 请求对象
     * @return AsyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse>
     */
    public AsyncInvoker<ShowSystemConfigsRequest, ShowSystemConfigsResponse> showSystemConfigsAsyncInvoker(
        ShowSystemConfigsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showSystemConfigs, hcClient);
    }

    /**
     * 获取模板V2
     *
     * 获取模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByIdRequest 请求对象
     * @return CompletableFuture<ShowTemplateByIdResponse>
     */
    public CompletableFuture<ShowTemplateByIdResponse> showTemplateByIdAsync(ShowTemplateByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTemplateById);
    }

    /**
     * 获取模板V2
     *
     * 获取模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByIdRequest 请求对象
     * @return AsyncInvoker<ShowTemplateByIdRequest, ShowTemplateByIdResponse>
     */
    public AsyncInvoker<ShowTemplateByIdRequest, ShowTemplateByIdResponse> showTemplateByIdAsyncInvoker(
        ShowTemplateByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTemplateById, hcClient);
    }

    /**
     * 根据条件分页获取模板V3
     *
     * 根据条件分页获取模板V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByPageRequest 请求对象
     * @return CompletableFuture<ShowTemplateByPageResponse>
     */
    public CompletableFuture<ShowTemplateByPageResponse> showTemplateByPageAsync(ShowTemplateByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTemplateByPage);
    }

    /**
     * 根据条件分页获取模板V3
     *
     * 根据条件分页获取模板V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateByPageRequest 请求对象
     * @return AsyncInvoker<ShowTemplateByPageRequest, ShowTemplateByPageResponse>
     */
    public AsyncInvoker<ShowTemplateByPageRequest, ShowTemplateByPageResponse> showTemplateByPageAsyncInvoker(
        ShowTemplateByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTemplateByPage, hcClient);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return CompletableFuture<ShowTestCaseResponse>
     */
    public CompletableFuture<ShowTestCaseResponse> showTestCaseAsync(ShowTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCase);
    }

    /**
     * 查询用例详情
     *
     * 查询用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse>
     */
    public AsyncInvoker<ShowTestCaseRequest, ShowTestCaseResponse> showTestCaseAsyncInvoker(
        ShowTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCase, hcClient);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return CompletableFuture<ShowTestCaseAndDefectInfoResponse>
     */
    public CompletableFuture<ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoAsync(
        ShowTestCaseAndDefectInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseAndDefectInfo);
    }

    /**
     * 查询用户用例关联缺陷的统计信息
     *
     * 查询用户用例关联缺陷的统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseAndDefectInfoRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse>
     */
    public AsyncInvoker<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfoAsyncInvoker(
        ShowTestCaseAndDefectInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseAndDefectInfo, hcClient);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return CompletableFuture<ShowTestCaseDetailResponse>
     */
    public CompletableFuture<ShowTestCaseDetailResponse> showTestCaseDetailAsync(ShowTestCaseDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetail);
    }

    /**
     * 获取测试用例详情
     *
     * 获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse>
     */
    public AsyncInvoker<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetailAsyncInvoker(
        ShowTestCaseDetailRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseDetail, hcClient);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return CompletableFuture<ShowTestCaseDetailV2Response>
     */
    public CompletableFuture<ShowTestCaseDetailV2Response> showTestCaseDetailV2Async(
        ShowTestCaseDetailV2Request request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseDetailV2);
    }

    /**
     * 通过用例编号获取测试用例详情
     *
     * 通过用例编号获取测试用例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseDetailV2Request 请求对象
     * @return AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response>
     */
    public AsyncInvoker<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2AsyncInvoker(
        ShowTestCaseDetailV2Request request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseDetailV2, hcClient);
    }

    /**
     * 根据用例查询评审记录
     *
     * 根据用例查询评审记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseReviewsRequest 请求对象
     * @return CompletableFuture<ShowTestCaseReviewsResponse>
     */
    public CompletableFuture<ShowTestCaseReviewsResponse> showTestCaseReviewsAsync(ShowTestCaseReviewsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCaseReviews);
    }

    /**
     * 根据用例查询评审记录
     *
     * 根据用例查询评审记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCaseReviewsRequest 请求对象
     * @return AsyncInvoker<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse>
     */
    public AsyncInvoker<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse> showTestCaseReviewsAsyncInvoker(
        ShowTestCaseReviewsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCaseReviews, hcClient);
    }

    /**
     * 版本测试用例变更统计（只统计分支，不统计基线）
     *
     * 版本测试用例变更统计（只统计分支，不统计基线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCasesChangeStatisticsRequest 请求对象
     * @return CompletableFuture<ShowTestCasesChangeStatisticsResponse>
     */
    public CompletableFuture<ShowTestCasesChangeStatisticsResponse> showTestCasesChangeStatisticsAsync(
        ShowTestCasesChangeStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestCasesChangeStatistics);
    }

    /**
     * 版本测试用例变更统计（只统计分支，不统计基线）
     *
     * 版本测试用例变更统计（只统计分支，不统计基线）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestCasesChangeStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse>
     */
    public AsyncInvoker<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse> showTestCasesChangeStatisticsAsyncInvoker(
        ShowTestCasesChangeStatisticsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestCasesChangeStatistics, hcClient);
    }

    /**
     * 根据条件分页获取测试用例对象V2
     *
     * 根据条件分页获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByPageRequest 请求对象
     * @return CompletableFuture<ShowTestcaseByPageResponse>
     */
    public CompletableFuture<ShowTestcaseByPageResponse> showTestcaseByPageAsync(ShowTestcaseByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestcaseByPage);
    }

    /**
     * 根据条件分页获取测试用例对象V2
     *
     * 根据条件分页获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByPageRequest 请求对象
     * @return AsyncInvoker<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse>
     */
    public AsyncInvoker<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse> showTestcaseByPageAsyncInvoker(
        ShowTestcaseByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestcaseByPage, hcClient);
    }

    /**
     * 根据条件分页获取测试点对象V2
     *
     * 根据条件分页获取测试点对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestpointByPageRequest 请求对象
     * @return CompletableFuture<ShowTestpointByPageResponse>
     */
    public CompletableFuture<ShowTestpointByPageResponse> showTestpointByPageAsync(ShowTestpointByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestpointByPage);
    }

    /**
     * 根据条件分页获取测试点对象V2
     *
     * 根据条件分页获取测试点对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestpointByPageRequest 请求对象
     * @return AsyncInvoker<ShowTestpointByPageRequest, ShowTestpointByPageResponse>
     */
    public AsyncInvoker<ShowTestpointByPageRequest, ShowTestpointByPageResponse> showTestpointByPageAsyncInvoker(
        ShowTestpointByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestpointByPage, hcClient);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return CompletableFuture<ShowUserAccessInfoResponse>
     */
    public CompletableFuture<ShowUserAccessInfoResponse> showUserAccessInfoAsync(ShowUserAccessInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showUserAccessInfo);
    }

    /**
     * 获取租户订单信息
     *
     * 获取租户订单信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserAccessInfoRequest 请求对象
     * @return AsyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse>
     */
    public AsyncInvoker<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> showUserAccessInfoAsyncInvoker(
        ShowUserAccessInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showUserAccessInfo, hcClient);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return CompletableFuture<ShowUserExecuteTestCaseInfoResponse>
     */
    public CompletableFuture<ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoAsync(
        ShowUserExecuteTestCaseInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showUserExecuteTestCaseInfo);
    }

    /**
     * 查询时段内用例的执行情况
     *
     * 查询时段内用例的执行情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserExecuteTestCaseInfoRequest 请求对象
     * @return AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse>
     */
    public AsyncInvoker<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfoAsyncInvoker(
        ShowUserExecuteTestCaseInfoRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showUserExecuteTestCaseInfo, hcClient);
    }

    /**
     * 修改关键字信息接口
     *
     * 修改关键字信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBasicAwByIdRequest 请求对象
     * @return CompletableFuture<UpdateBasicAwByIdResponse>
     */
    public CompletableFuture<UpdateBasicAwByIdResponse> updateBasicAwByIdAsync(UpdateBasicAwByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateBasicAwById);
    }

    /**
     * 修改关键字信息接口
     *
     * 修改关键字信息接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBasicAwByIdRequest 请求对象
     * @return AsyncInvoker<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse>
     */
    public AsyncInvoker<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse> updateBasicAwByIdAsyncInvoker(
        UpdateBasicAwByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateBasicAwById, hcClient);
    }

    /**
     * 修改测试计划
     *
     * 修改测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIteratorRequest 请求对象
     * @return CompletableFuture<UpdateIteratorResponse>
     */
    public CompletableFuture<UpdateIteratorResponse> updateIteratorAsync(UpdateIteratorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateIterator);
    }

    /**
     * 修改测试计划
     *
     * 修改测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIteratorRequest 请求对象
     * @return AsyncInvoker<UpdateIteratorRequest, UpdateIteratorResponse>
     */
    public AsyncInvoker<UpdateIteratorRequest, UpdateIteratorResponse> updateIteratorAsyncInvoker(
        UpdateIteratorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateIterator, hcClient);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return CompletableFuture<UpdateServiceResponse>
     */
    public CompletableFuture<UpdateServiceResponse> updateServiceAsync(UpdateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateService);
    }

    /**
     * 更新已注册服务
     *
     * 更新已注册服务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse>
     */
    public AsyncInvoker<UpdateServiceRequest, UpdateServiceResponse> updateServiceAsyncInvoker(
        UpdateServiceRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateService, hcClient);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResponse>
     */
    public CompletableFuture<UpdateTestCaseResponse> updateTestCaseAsync(UpdateTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCase);
    }

    /**
     * 更新自定义测试服务类型用例
     *
     * 更新自定义测试服务类型用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse>
     */
    public AsyncInvoker<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCaseAsyncInvoker(
        UpdateTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateTestCase, hcClient);
    }

    /**
     * 更新tmss用例和用例脚本
     *
     * 更新tmss用例和用例脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseAndScriptRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseAndScriptResponse>
     */
    public CompletableFuture<UpdateTestCaseAndScriptResponse> updateTestCaseAndScriptAsync(
        UpdateTestCaseAndScriptRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseAndScript);
    }

    /**
     * 更新tmss用例和用例脚本
     *
     * 更新tmss用例和用例脚本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseAndScriptRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse>
     */
    public AsyncInvoker<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse> updateTestCaseAndScriptAsyncInvoker(
        UpdateTestCaseAndScriptRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateTestCaseAndScript, hcClient);
    }

    /**
     * 修改用例评论
     *
     * 修改用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseCommentRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseCommentResponse>
     */
    public CompletableFuture<UpdateTestCaseCommentResponse> updateTestCaseCommentAsync(
        UpdateTestCaseCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseComment);
    }

    /**
     * 修改用例评论
     *
     * 修改用例评论
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseCommentRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse>
     */
    public AsyncInvoker<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse> updateTestCaseCommentAsyncInvoker(
        UpdateTestCaseCommentRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateTestCaseComment, hcClient);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return CompletableFuture<UpdateTestCaseResultResponse>
     */
    public CompletableFuture<UpdateTestCaseResultResponse> updateTestCaseResultAsync(
        UpdateTestCaseResultRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateTestCaseResult);
    }

    /**
     * 批量更新测试用例结果
     *
     * 批量更新测试用例结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTestCaseResultRequest 请求对象
     * @return AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse>
     */
    public AsyncInvoker<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResultAsyncInvoker(
        UpdateTestCaseResultRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateTestCaseResult, hcClient);
    }

    /**
     * 更新用户DNS映射
     *
     * 更新用户DNS映射，执行器自定义映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserDnsMappingRequest 请求对象
     * @return CompletableFuture<UpdateUserDnsMappingResponse>
     */
    public CompletableFuture<UpdateUserDnsMappingResponse> updateUserDnsMappingAsync(
        UpdateUserDnsMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateUserDnsMapping);
    }

    /**
     * 更新用户DNS映射
     *
     * 更新用户DNS映射，执行器自定义映射
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserDnsMappingRequest 请求对象
     * @return AsyncInvoker<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse>
     */
    public AsyncInvoker<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse> updateUserDnsMappingAsyncInvoker(
        UpdateUserDnsMappingRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateUserDnsMapping, hcClient);
    }

    /**
     * 在分支或者测试计划下修改用例
     *
     * 在分支或者测试计划下修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionTestCaseRequest 请求对象
     * @return CompletableFuture<UpdateVersionTestCaseResponse>
     */
    public CompletableFuture<UpdateVersionTestCaseResponse> updateVersionTestCaseAsync(
        UpdateVersionTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateVersionTestCase);
    }

    /**
     * 在分支或者测试计划下修改用例
     *
     * 在分支或者测试计划下修改用例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateVersionTestCaseRequest 请求对象
     * @return AsyncInvoker<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse>
     */
    public AsyncInvoker<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse> updateVersionTestCaseAsyncInvoker(
        UpdateVersionTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateVersionTestCase, hcClient);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return CompletableFuture<CreateApiTestSuiteByRepoFileResponse>
     */
    public CompletableFuture<CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileAsync(
        CreateApiTestSuiteByRepoFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createApiTestSuiteByRepoFile);
    }

    /**
     * 通过导入仓库中的文件生成接口测试套
     *
     * 通过导入仓库中的文件生成接口测试套
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiTestSuiteByRepoFileRequest 请求对象
     * @return AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse>
     */
    public AsyncInvoker<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFileAsyncInvoker(
        CreateApiTestSuiteByRepoFileRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createApiTestSuiteByRepoFile, hcClient);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return CompletableFuture<ListEnvironmentsResponse>
     */
    public CompletableFuture<ListEnvironmentsResponse> listEnvironmentsAsync(ListEnvironmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listEnvironments);
    }

    /**
     * 获取环境参数分组列表
     *
     * 获取环境参数分组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvironmentsRequest 请求对象
     * @return AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse>
     */
    public AsyncInvoker<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironmentsAsyncInvoker(
        ListEnvironmentsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listEnvironments, hcClient);
    }

    /**
     * 上传测试步骤图片
     *
     * 对外API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadStepImgRequest 请求对象
     * @return CompletableFuture<UploadStepImgResponse>
     */
    public CompletableFuture<UploadStepImgResponse> uploadStepImgAsync(UploadStepImgRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.uploadStepImg);
    }

    /**
     * 上传测试步骤图片
     *
     * 对外API
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadStepImgRequest 请求对象
     * @return AsyncInvoker<UploadStepImgRequest, UploadStepImgResponse>
     */
    public AsyncInvoker<UploadStepImgRequest, UploadStepImgResponse> uploadStepImgAsyncInvoker(
        UploadStepImgRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.uploadStepImg, hcClient);
    }

    /**
     * 批量删除因子
     *
     * 批量删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacotrByIdsRequest 请求对象
     * @return CompletableFuture<BatchDeleteFacotrByIdsResponse>
     */
    public CompletableFuture<BatchDeleteFacotrByIdsResponse> batchDeleteFacotrByIdsAsync(
        BatchDeleteFacotrByIdsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchDeleteFacotrByIds);
    }

    /**
     * 批量删除因子
     *
     * 批量删除因子
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteFacotrByIdsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse>
     */
    public AsyncInvoker<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse> batchDeleteFacotrByIdsAsyncInvoker(
        BatchDeleteFacotrByIdsRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchDeleteFacotrByIds, hcClient);
    }

    /**
     * 批量查询用例V3
     *
     * 批量查询用例V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowTestCaseRequest 请求对象
     * @return CompletableFuture<BatchShowTestCaseResponse>
     */
    public CompletableFuture<BatchShowTestCaseResponse> batchShowTestCaseAsync(BatchShowTestCaseRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.batchShowTestCase);
    }

    /**
     * 批量查询用例V3
     *
     * 批量查询用例V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowTestCaseRequest 请求对象
     * @return AsyncInvoker<BatchShowTestCaseRequest, BatchShowTestCaseResponse>
     */
    public AsyncInvoker<BatchShowTestCaseRequest, BatchShowTestCaseResponse> batchShowTestCaseAsyncInvoker(
        BatchShowTestCaseRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.batchShowTestCase, hcClient);
    }

    /**
     * 新增资产树节点
     *
     * 新增资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetTreeRequest 请求对象
     * @return CompletableFuture<CreateAssetTreeResponse>
     */
    public CompletableFuture<CreateAssetTreeResponse> createAssetTreeAsync(CreateAssetTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createAssetTree);
    }

    /**
     * 新增资产树节点
     *
     * 新增资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssetTreeRequest 请求对象
     * @return AsyncInvoker<CreateAssetTreeRequest, CreateAssetTreeResponse>
     */
    public AsyncInvoker<CreateAssetTreeRequest, CreateAssetTreeResponse> createAssetTreeAsyncInvoker(
        CreateAssetTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createAssetTree, hcClient);
    }

    /**
     * 备份脑图V2
     *
     * 备份脑图V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackupMindmapRequest 请求对象
     * @return CompletableFuture<CreateBackupMindmapResponse>
     */
    public CompletableFuture<CreateBackupMindmapResponse> createBackupMindmapAsync(CreateBackupMindmapRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createBackupMindmap);
    }

    /**
     * 备份脑图V2
     *
     * 备份脑图V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackupMindmapRequest 请求对象
     * @return AsyncInvoker<CreateBackupMindmapRequest, CreateBackupMindmapResponse>
     */
    public AsyncInvoker<CreateBackupMindmapRequest, CreateBackupMindmapResponse> createBackupMindmapAsyncInvoker(
        CreateBackupMindmapRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createBackupMindmap, hcClient);
    }

    /**
     * 保存模板V2
     *
     * 保存模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.createTemplate);
    }

    /**
     * 保存模板V2
     *
     * 保存模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.createTemplate, hcClient);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return CompletableFuture<DeleteAssetResponse>
     */
    public CompletableFuture<DeleteAssetResponse> deleteAssetAsync(DeleteAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteAsset);
    }

    /**
     * 删除资产
     *
     * 删除资产
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetRequest 请求对象
     * @return AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse>
     */
    public AsyncInvoker<DeleteAssetRequest, DeleteAssetResponse> deleteAssetAsyncInvoker(DeleteAssetRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteAsset, hcClient);
    }

    /**
     * 删除资产树节点
     *
     * 删除资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetTreeRequest 请求对象
     * @return CompletableFuture<DeleteAssetTreeResponse>
     */
    public CompletableFuture<DeleteAssetTreeResponse> deleteAssetTreeAsync(DeleteAssetTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteAssetTree);
    }

    /**
     * 删除资产树节点
     *
     * 删除资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssetTreeRequest 请求对象
     * @return AsyncInvoker<DeleteAssetTreeRequest, DeleteAssetTreeResponse>
     */
    public AsyncInvoker<DeleteAssetTreeRequest, DeleteAssetTreeResponse> deleteAssetTreeAsyncInvoker(
        DeleteAssetTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteAssetTree, hcClient);
    }

    /**
     * 根据id删除脑图备份V2
     *
     * 根据id删除脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapBackupByIdRequest 请求对象
     * @return CompletableFuture<DeleteMindmapBackupByIdResponse>
     */
    public CompletableFuture<DeleteMindmapBackupByIdResponse> deleteMindmapBackupByIdAsync(
        DeleteMindmapBackupByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteMindmapBackupById);
    }

    /**
     * 根据id删除脑图备份V2
     *
     * 根据id删除脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapBackupByIdRequest 请求对象
     * @return AsyncInvoker<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse>
     */
    public AsyncInvoker<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse> deleteMindmapBackupByIdAsyncInvoker(
        DeleteMindmapBackupByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteMindmapBackupById, hcClient);
    }

    /**
     * 删除脑图回收站V2
     *
     * 删除脑图回收站V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapRecycleByIdRequest 请求对象
     * @return CompletableFuture<DeleteMindmapRecycleByIdResponse>
     */
    public CompletableFuture<DeleteMindmapRecycleByIdResponse> deleteMindmapRecycleByIdAsync(
        DeleteMindmapRecycleByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteMindmapRecycleById);
    }

    /**
     * 删除脑图回收站V2
     *
     * 删除脑图回收站V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMindmapRecycleByIdRequest 请求对象
     * @return AsyncInvoker<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse>
     */
    public AsyncInvoker<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse> deleteMindmapRecycleByIdAsyncInvoker(
        DeleteMindmapRecycleByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteMindmapRecycleById, hcClient);
    }

    /**
     * 删除模板V2
     *
     * 删除模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateByIdRequest 请求对象
     * @return CompletableFuture<DeleteTemplateByIdResponse>
     */
    public CompletableFuture<DeleteTemplateByIdResponse> deleteTemplateByIdAsync(DeleteTemplateByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.deleteTemplateById);
    }

    /**
     * 删除模板V2
     *
     * 删除模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateByIdRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse>
     */
    public AsyncInvoker<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse> deleteTemplateByIdAsyncInvoker(
        DeleteTemplateByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.deleteTemplateById, hcClient);
    }

    /**
     * 下载资产模板
     *
     * 下载资产模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetTemplateRequest 请求对象
     * @return CompletableFuture<DownloadAssetTemplateResponse>
     */
    public CompletableFuture<DownloadAssetTemplateResponse> downloadAssetTemplateAsync(
        DownloadAssetTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.downloadAssetTemplate);
    }

    /**
     * 下载资产模板
     *
     * 下载资产模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadAssetTemplateRequest 请求对象
     * @return AsyncInvoker<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse>
     */
    public AsyncInvoker<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse> downloadAssetTemplateAsyncInvoker(
        DownloadAssetTemplateRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.downloadAssetTemplate, hcClient);
    }

    /**
     * 因子库导出
     *
     * 因子库导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFactorRequest 请求对象
     * @return CompletableFuture<ExportFactorResponse>
     */
    public CompletableFuture<ExportFactorResponse> exportFactorAsync(ExportFactorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.exportFactor);
    }

    /**
     * 因子库导出
     *
     * 因子库导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFactorRequest 请求对象
     * @return AsyncInvoker<ExportFactorRequest, ExportFactorResponse>
     */
    public AsyncInvoker<ExportFactorRequest, ExportFactorResponse> exportFactorAsyncInvoker(
        ExportFactorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.exportFactor, hcClient);
    }

    /**
     * 资产导入
     *
     * 资产导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAssetRequest 请求对象
     * @return CompletableFuture<ImportAssetResponse>
     */
    public CompletableFuture<ImportAssetResponse> importAssetAsync(ImportAssetRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.importAsset);
    }

    /**
     * 资产导入
     *
     * 资产导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportAssetRequest 请求对象
     * @return AsyncInvoker<ImportAssetRequest, ImportAssetResponse>
     */
    public AsyncInvoker<ImportAssetRequest, ImportAssetResponse> importAssetAsyncInvoker(ImportAssetRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.importAsset, hcClient);
    }

    /**
     * 因子导入
     *
     * 因子导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportFactorRequest 请求对象
     * @return CompletableFuture<ImportFactorResponse>
     */
    public CompletableFuture<ImportFactorResponse> importFactorAsync(ImportFactorRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.importFactor);
    }

    /**
     * 因子导入
     *
     * 因子导入
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportFactorRequest 请求对象
     * @return AsyncInvoker<ImportFactorRequest, ImportFactorResponse>
     */
    public AsyncInvoker<ImportFactorRequest, ImportFactorResponse> importFactorAsyncInvoker(
        ImportFactorRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.importFactor, hcClient);
    }

    /**
     * 获取默认模板V2
     *
     * 获取默认模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultTemplateByPageRequest 请求对象
     * @return CompletableFuture<ShowDefaultTemplateByPageResponse>
     */
    public CompletableFuture<ShowDefaultTemplateByPageResponse> showDefaultTemplateByPageAsync(
        ShowDefaultTemplateByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showDefaultTemplateByPage);
    }

    /**
     * 获取默认模板V2
     *
     * 获取默认模板V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDefaultTemplateByPageRequest 请求对象
     * @return AsyncInvoker<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse>
     */
    public AsyncInvoker<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse> showDefaultTemplateByPageAsyncInvoker(
        ShowDefaultTemplateByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showDefaultTemplateByPage, hcClient);
    }

    /**
     * 根据id获取脑图备份V2
     *
     * 根据id获取脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByIdRequest 请求对象
     * @return CompletableFuture<ShowMindmapBackupByIdResponse>
     */
    public CompletableFuture<ShowMindmapBackupByIdResponse> showMindmapBackupByIdAsync(
        ShowMindmapBackupByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapBackupById);
    }

    /**
     * 根据id获取脑图备份V2
     *
     * 根据id获取脑图备份V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByIdRequest 请求对象
     * @return AsyncInvoker<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse>
     */
    public AsyncInvoker<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse> showMindmapBackupByIdAsyncInvoker(
        ShowMindmapBackupByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapBackupById, hcClient);
    }

    /**
     * 根据条件分页获取脑图备份对象V3
     *
     * 根据条件分页获取脑图备份对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByPageRequest 请求对象
     * @return CompletableFuture<ShowMindmapBackupByPageResponse>
     */
    public CompletableFuture<ShowMindmapBackupByPageResponse> showMindmapBackupByPageAsync(
        ShowMindmapBackupByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapBackupByPage);
    }

    /**
     * 根据条件分页获取脑图备份对象V3
     *
     * 根据条件分页获取脑图备份对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapBackupByPageRequest 请求对象
     * @return AsyncInvoker<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse>
     */
    public AsyncInvoker<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse> showMindmapBackupByPageAsyncInvoker(
        ShowMindmapBackupByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapBackupByPage, hcClient);
    }

    /**
     * 根据id获取回收站脑图对象V2
     *
     * 根据id获取回收站脑图对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByIdRequest 请求对象
     * @return CompletableFuture<ShowMindmapRecycleByIdResponse>
     */
    public CompletableFuture<ShowMindmapRecycleByIdResponse> showMindmapRecycleByIdAsync(
        ShowMindmapRecycleByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapRecycleById);
    }

    /**
     * 根据id获取回收站脑图对象V2
     *
     * 根据id获取回收站脑图对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByIdRequest 请求对象
     * @return AsyncInvoker<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse>
     */
    public AsyncInvoker<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse> showMindmapRecycleByIdAsyncInvoker(
        ShowMindmapRecycleByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapRecycleById, hcClient);
    }

    /**
     * 根据条件分页获取回收站脑图对象V3
     *
     * 根据条件分页获取回收站脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByPageRequest 请求对象
     * @return CompletableFuture<ShowMindmapRecycleByPageResponse>
     */
    public CompletableFuture<ShowMindmapRecycleByPageResponse> showMindmapRecycleByPageAsync(
        ShowMindmapRecycleByPageRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showMindmapRecycleByPage);
    }

    /**
     * 根据条件分页获取回收站脑图对象V3
     *
     * 根据条件分页获取回收站脑图对象V3
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMindmapRecycleByPageRequest 请求对象
     * @return AsyncInvoker<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse>
     */
    public AsyncInvoker<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse> showMindmapRecycleByPageAsyncInvoker(
        ShowMindmapRecycleByPageRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showMindmapRecycleByPage, hcClient);
    }

    /**
     * 根据id获取测试用例对象V2
     *
     * 根据id获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByIdRequest 请求对象
     * @return CompletableFuture<ShowTestcaseByIdResponse>
     */
    public CompletableFuture<ShowTestcaseByIdResponse> showTestcaseByIdAsync(ShowTestcaseByIdRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.showTestcaseById);
    }

    /**
     * 根据id获取测试用例对象V2
     *
     * 根据id获取测试用例对象V2
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTestcaseByIdRequest 请求对象
     * @return AsyncInvoker<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse>
     */
    public AsyncInvoker<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse> showTestcaseByIdAsyncInvoker(
        ShowTestcaseByIdRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.showTestcaseById, hcClient);
    }

    /**
     * 修改资产树节点
     *
     * 修改资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetTreeRequest 请求对象
     * @return CompletableFuture<UpdateAssetTreeResponse>
     */
    public CompletableFuture<UpdateAssetTreeResponse> updateAssetTreeAsync(UpdateAssetTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateAssetTree);
    }

    /**
     * 修改资产树节点
     *
     * 修改资产树节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssetTreeRequest 请求对象
     * @return AsyncInvoker<UpdateAssetTreeRequest, UpdateAssetTreeResponse>
     */
    public AsyncInvoker<UpdateAssetTreeRequest, UpdateAssetTreeResponse> updateAssetTreeAsyncInvoker(
        UpdateAssetTreeRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateAssetTree, hcClient);
    }

    /**
     * 脑图名称编辑
     *
     * 脑图名称编辑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMindmapNameRequest 请求对象
     * @return CompletableFuture<UpdateMindmapNameResponse>
     */
    public CompletableFuture<UpdateMindmapNameResponse> updateMindmapNameAsync(UpdateMindmapNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.updateMindmapName);
    }

    /**
     * 脑图名称编辑
     *
     * 脑图名称编辑
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMindmapNameRequest 请求对象
     * @return AsyncInvoker<UpdateMindmapNameRequest, UpdateMindmapNameResponse>
     */
    public AsyncInvoker<UpdateMindmapNameRequest, UpdateMindmapNameResponse> updateMindmapNameAsyncInvoker(
        UpdateMindmapNameRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.updateMindmapName, hcClient);
    }

    /**
     * 添加目录信息
     *
     * 添加目录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFeatureRequest 请求对象
     * @return CompletableFuture<AddFeatureResponse>
     */
    public CompletableFuture<AddFeatureResponse> addFeatureAsync(AddFeatureRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.addFeature);
    }

    /**
     * 添加目录信息
     *
     * 添加目录信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFeatureRequest 请求对象
     * @return AsyncInvoker<AddFeatureRequest, AddFeatureResponse>
     */
    public AsyncInvoker<AddFeatureRequest, AddFeatureResponse> addFeatureAsyncInvoker(AddFeatureRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.addFeature, hcClient);
    }

    /**
     * 根据测试用例URI或用例编号查询测试用例对应的测试计划
     *
     * 根据测试用例URI或用例编号查询测试用例对应的测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasePlansRequest 请求对象
     * @return CompletableFuture<ListTestcasePlansResponse>
     */
    public CompletableFuture<ListTestcasePlansResponse> listTestcasePlansAsync(ListTestcasePlansRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudtestMeta.listTestcasePlans);
    }

    /**
     * 根据测试用例URI或用例编号查询测试用例对应的测试计划
     *
     * 根据测试用例URI或用例编号查询测试用例对应的测试计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTestcasePlansRequest 请求对象
     * @return AsyncInvoker<ListTestcasePlansRequest, ListTestcasePlansResponse>
     */
    public AsyncInvoker<ListTestcasePlansRequest, ListTestcasePlansResponse> listTestcasePlansAsyncInvoker(
        ListTestcasePlansRequest request) {
        return new AsyncInvoker<>(request, CloudtestMeta.listTestcasePlans, hcClient);
    }

}
