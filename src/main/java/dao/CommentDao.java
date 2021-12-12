package dao;

import base.BaseDao;
import dto.ProductCommentDetailDto;
import org.hibernate.query.Query;

import java.util.List;

public class CommentDao extends BaseDao {


    public List<ProductCommentDetailDto> findAllProductCommentDetailDtoByProduct(Long productId){
        String sql = " select " +
                " new dto.ProductDetailDto( new dto.ProductDetailDto( product.name, category.name, product.price ), "+
                " new dto.UserInfoDetailDto(user_info.name, user_info.surname, user_info.email, user_info.phone_number), " +
                "new dto.CommentDetailDto( product_comment.comment, product_comment.comment_date ) ) " +
                " from Product product" +
                " inner join Category category  on product.category.id = category.id " +
                " inner join ProductComment productComment  on ProductComment.product.id = product.id " +
                " inner join UserInfo on userInfo.id = productComment.userInfo.id " +
                " where product.id = :productId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return query.list();
    }

    public List<ProductCommentDetailDto> findCommentCountAndDetailByProduct(Long productId){
        String sql = " select " +
                " new dto.ProductDetailDto( new dto.ProductDetailDto( product.name, category.name, product.price ), "+
                " new dto.UserInfoDetailDto(user_info.name, user_info.surname, user_info.email, user_info.phone_number), " +
                "new dto.CommentDetailDto( product_comment.comment, product_comment.comment_date ) ) " +
                " from Product product" +
                " inner join Category category  on product.category.id = category.id " +
                " inner join ProductComment productComment  on ProductComment.product.id = product.id " +
                " inner join UserInfo on userInfo.id = productComment.userInfo.id " +
                " where product.id = :productId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return query.list();
    }

    public List<ProductCommentDetailDto> findUserCommentsDetailByUser(Long userId){
        String sql = " select " +
                " new dto.ProductDetailDto( new dto.ProductDetailDto( product.name, category.name, product.price ), "+
                " new dto.UserInfoDetailDto(user_info.name, user_info.surname, user_info.email, user_info.phone_number), " +
                "new dto.CommentDetailDto( product_comment.comment, product_comment.comment_date ) ) " +
                " from Product product" +
                " inner join Category category  on product.category.id = category.id " +
                " inner join ProductComment productComment  on ProductComment.product.id = product.id " +
                " inner join UserInfo on userInfo.id = productComment.userInfo.id " +
                " where product.id = :productId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId", userId);

        return query.list();
    }

}
