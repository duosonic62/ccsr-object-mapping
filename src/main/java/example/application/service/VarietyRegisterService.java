package example.application.service;

import example.application.repository.VarietyRepository;
import example.domain.model.kit.row.Variety;
import org.springframework.stereotype.Service;

/**
 * ハーブ品種の登録サービス
 */
@Service
public class VarietyRegisterService {
    VarietyRepository varietyRepository;

    public VarietyRegisterService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    /**
     * ハーブ品種を登録する
     * @param variety
     */
    public void register(Variety variety) {
        varietyRepository.register(variety);
    }
}
