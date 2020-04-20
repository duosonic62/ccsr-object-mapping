package example.infrastructure.datasource.product.variety;

import example.application.repository.VarietyRepository;
import example.domain.model.product.row.Variety;
import org.springframework.stereotype.Repository;

@Repository
public class VarietyDatasource implements VarietyRepository {

    VarietyMapper varietyMapper;

    public VarietyDatasource(@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection") VarietyMapper varietyMapper) {
        this.varietyMapper = varietyMapper;
    }

    @Override
    public Variety[] listAll() {
        return varietyMapper.listAll();
    }

    @Override
    public void register(Variety variety) {
        varietyMapper.register(variety);
    }
}