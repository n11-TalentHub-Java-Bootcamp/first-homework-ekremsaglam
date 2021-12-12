package Applications;

import dto.ProductCommentDetailDto;
import dto.ProductDetailDto;
import entityservice.ProductCommentEntityService;
import entityservice.ProductEntityService;

import java.util.List;

public class FindProductCommentsByUser {

    public static void main(String[] args) {

        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentDetailDto> productCommentList = service.findUserCommentsDetailByUser(1L);

        for (ProductCommentDetailDto productCommentDetailDto : productCommentList) {
            System.out.println(productCommentDetailDto);
        }
    }
}
