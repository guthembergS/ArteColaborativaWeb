import { TestBed } from '@angular/core/testing';

import { LojistaService } from './lojista.service';

describe('LojistaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LojistaService = TestBed.get(LojistaService);
    expect(service).toBeTruthy();
  });
});
